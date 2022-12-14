package p002.inventario.gui;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import modelos.Proveedor;

import javax.swing.border.TitledBorder;

import org.apache.commons.validator.routines.LongValidator;

import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProveedoresCrearFormulario extends JInternalFrame {

	/**
	 * ID de versión de clase.
	 */
	private static final long serialVersionUID = 4875332889027488723L;
	private JTextField txtId;
	private JTextField txtNombre;
	private JTextField txtDireccion;
	private JTextField txtTelefono;

	/**
	 * Create the frame.
	 */
	public ProveedoresCrearFormulario(Aplicacion aplicacion) {
		setTitle("Proveedores - Crear");
		setClosable(true);
		setBounds(100, 100, 450, 230);

		JPanel pnlProveedoresCrear = new JPanel();
		pnlProveedoresCrear
				.setBorder(new TitledBorder(null, "Datos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(pnlProveedoresCrear, BorderLayout.CENTER);
		pnlProveedoresCrear.setLayout(new FormLayout(
				new ColumnSpec[] { FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
						FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC, FormSpecs.RELATED_GAP_COLSPEC,
						FormSpecs.DEFAULT_COLSPEC, FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
						FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC, FormSpecs.RELATED_GAP_COLSPEC,
						ColumnSpec.decode("default:grow"), },
				new RowSpec[] { FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, }));

		JLabel lblId = new JLabel("ID");
		pnlProveedoresCrear.add(lblId, "2, 2");

		txtId = new JTextField();
		pnlProveedoresCrear.add(txtId, "12, 2, fill, default");
		txtId.setColumns(10);

		JLabel lblNombre = new JLabel("Nombre");
		pnlProveedoresCrear.add(lblNombre, "2, 4");

		txtNombre = new JTextField();
		pnlProveedoresCrear.add(txtNombre, "12, 4, fill, default");
		txtNombre.setColumns(10);

		JLabel lblDireccion = new JLabel("Dirección");
		pnlProveedoresCrear.add(lblDireccion, "2, 6");

		txtDireccion = new JTextField();
		pnlProveedoresCrear.add(txtDireccion, "12, 6, fill, default");
		txtDireccion.setColumns(10);

		JLabel lblTelefono = new JLabel("Teléfono");
		pnlProveedoresCrear.add(lblTelefono, "2, 8");

		txtTelefono = new JTextField();
		pnlProveedoresCrear.add(txtTelefono, "12, 8, fill, default");
		txtTelefono.setColumns(10);

		JButton btnCrear = new JButton("Crear");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = txtId.getText().trim();
				String nombre = txtNombre.getText().trim();
				String direccion = txtDireccion.getText().trim();
				String telefono = txtTelefono.getText().trim();

				if (id.isEmpty()) {
					JOptionPane.showMessageDialog(ProveedoresCrearFormulario.this, "El campo ID es obligatorio.",
							"Mensaje", JOptionPane.WARNING_MESSAGE);
					return;
				}

				Long numero = LongValidator.getInstance().validate(id);

				if (numero == null) {
					JOptionPane.showMessageDialog(ProveedoresCrearFormulario.this,
							"El campo ID debe ser un número entero.", "Mensaje", JOptionPane.WARNING_MESSAGE);
					return;
				}

				if (numero <= 0) {
					JOptionPane.showMessageDialog(ProveedoresCrearFormulario.this,
							"El campo ID debe ser un número entero positivo.", "Mensaje", JOptionPane.WARNING_MESSAGE);
					return;
				}

				Proveedor proveedor = aplicacion.buscarProveedorPorId(numero);

				if (proveedor != null) {
					JOptionPane.showMessageDialog(ProveedoresCrearFormulario.this,
							"Ya existe un proveedor con el ID especificado.", "Mensaje", JOptionPane.WARNING_MESSAGE);
					return;
				}

				if (nombre.isEmpty()) {
					JOptionPane.showMessageDialog(ProveedoresCrearFormulario.this, "El campo Nombre es obligatorio.",
							"Mensaje", JOptionPane.WARNING_MESSAGE);
					return;
				}

				if (direccion.isEmpty()) {
					JOptionPane.showMessageDialog(ProveedoresCrearFormulario.this, "El campo Dirección es obligatorio.",
							"Mensaje", JOptionPane.WARNING_MESSAGE);
					return;
				}

				if (telefono.isEmpty()) {
					JOptionPane.showMessageDialog(ProveedoresCrearFormulario.this, "El campo Teléfono es obligatorio.",
							"Mensaje", JOptionPane.WARNING_MESSAGE);
					return;
				}

				if (telefono.length() != 10) {
					JOptionPane.showMessageDialog(ProveedoresCrearFormulario.this,
							"El campo Teléfono debe tener longitud 10.", "Mensaje", JOptionPane.WARNING_MESSAGE);
					return;
				}

				numero = LongValidator.getInstance().validate(telefono);

				if (numero <= 0) {
					JOptionPane.showMessageDialog(ProveedoresCrearFormulario.this,
							"El campo Teléfono debe ser un número positivo.", "Mensaje", JOptionPane.WARNING_MESSAGE);
					return;
				}

				proveedor = new Proveedor(Long.parseLong(id), nombre, telefono, direccion);

				aplicacion.crearProveedor(proveedor);

				JOptionPane.showMessageDialog(ProveedoresCrearFormulario.this,
						"El proveedor se ha creado de forma satisfactoria.", "Mensaje",
						JOptionPane.INFORMATION_MESSAGE);

				limpiarCampos();
			}
		});
		pnlProveedoresCrear.add(btnCrear, "12, 10");

	}

	private void limpiarCampos() {
		txtId.setText("");
		txtNombre.setText("");
		txtDireccion.setText("");
		txtTelefono.setText("");
	}
}
