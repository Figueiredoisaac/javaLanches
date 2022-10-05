package main.java;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.AbstractListModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.border.TitledBorder;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import main.java.br.com.figueiredoisaac.Lanches;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Component;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Program {

	private JFrame frmJavalanches;
	private JTextField txtNovoProduto;
	private JTextField txtR;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Program window = new Program();
					window.frmJavalanches.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Program() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJavalanches = new JFrame();
		frmJavalanches.setResizable(false);
		frmJavalanches.setTitle("javaLanches");
		frmJavalanches.setFont(new Font("Calibri", Font.PLAIN, 14));
		frmJavalanches.setBounds(100, 100, 807, 505);
		frmJavalanches.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);

		JPanel abaInicio = new JPanel();
		abaInicio.setBackground(SystemColor.window);
		tabbedPane.addTab("Inicio", null, abaInicio, null);

		JLabel bemVindo = new JLabel("javaLanches");
		bemVindo.setFont(new Font("Tahoma", Font.BOLD, 30));
		GroupLayout gl_abaInicio = new GroupLayout(abaInicio);
		gl_abaInicio.setHorizontalGroup(gl_abaInicio.createParallelGroup(Alignment.LEADING).addGroup(gl_abaInicio
				.createSequentialGroup().addGap(235).addComponent(bemVindo).addContainerGap(242, Short.MAX_VALUE)));
		gl_abaInicio.setVerticalGroup(gl_abaInicio.createParallelGroup(Alignment.LEADING).addGroup(gl_abaInicio
				.createSequentialGroup().addGap(205).addComponent(bemVindo).addContainerGap(218, Short.MAX_VALUE)));
		abaInicio.setLayout(gl_abaInicio);

		JPanel abaListaProdutos = new JPanel();
		abaListaProdutos.setBackground(SystemColor.window);
		tabbedPane.addTab("Lista de Produtos", null, abaListaProdutos, null);

		//Lista onde armazena os Lanches Cadastrados
		ArrayList<Lanches> listaLanches = new ArrayList<Lanches>();
		int tamanhoDaLista = listaLanches.size();
		
		JLabel lblNewLabel_7 = new JLabel("Lista de Produtos");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		JList list_2 = new JList();
		list_2.setModel(new AbstractListModel() {
			String[] values = new String[] {};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}

		});

		
		
		JButton btnAtualizaListaProduto = new JButton("Atualizar");
		btnAtualizaListaProduto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}
		});
		btnAtualizaListaProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GroupLayout gl_abaListaProdutos = new GroupLayout(abaListaProdutos);
		gl_abaListaProdutos.setHorizontalGroup(
			gl_abaListaProdutos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_abaListaProdutos.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_abaListaProdutos.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_abaListaProdutos.createSequentialGroup()
							.addComponent(lblNewLabel_7, GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
							.addGap(20))
						.addGroup(gl_abaListaProdutos.createSequentialGroup()
							.addComponent(btnAtualizaListaProduto)
							.addContainerGap())))
				.addGroup(gl_abaListaProdutos.createSequentialGroup()
					.addGap(42)
					.addComponent(list_2, GroupLayout.PREFERRED_SIZE, 471, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(150, Short.MAX_VALUE))
		);
		gl_abaListaProdutos.setVerticalGroup(
			gl_abaListaProdutos.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_abaListaProdutos.createSequentialGroup()
					.addGap(4)
					.addComponent(lblNewLabel_7)
					.addGap(31)
					.addComponent(list_2, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
					.addComponent(btnAtualizaListaProduto)
					.addGap(20))
		);
		abaListaProdutos.setLayout(gl_abaListaProdutos);

		JPanel abaAtualizarProduto = new JPanel();
		abaAtualizarProduto.setBackground(SystemColor.window);
		tabbedPane.addTab("Modificar", null, abaAtualizarProduto, null);

		JLabel nomeNovoProduto_1 = new JLabel("Nome");

		textField_1 = new JTextField();
		textField_1.setText("R$ 0,00");
		textField_1.setHorizontalAlignment(SwingConstants.LEFT);
		textField_1.setColumns(10);

		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		textField_2 = new JTextField();
		textField_2.setName("");
		textField_2.setColumns(10);

		JLabel valorNovoProduto_1 = new JLabel("Valor");

		JLabel lblNewLabel_4_1 = new JLabel("Modificar Produtos");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 18));

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "0001", "0002", "0003", "0004" }));

		JLabel lblNewLabel_5 = new JLabel("ID");

		JButton btnNewButton_2 = new JButton("Selecionar");

		JLabel nomeNovoProduto_1_1 = new JLabel("Novo Nome");

		textField_4 = new JTextField();
		textField_4.setName("");
		textField_4.setColumns(10);

		JLabel nomeNovoProduto_1_1_1 = new JLabel("Novo Valor");

		textField_5 = new JTextField();
		textField_5.setText("R$ 0,00");
		textField_5.setHorizontalAlignment(SwingConstants.LEFT);
		textField_5.setColumns(10);

		JLabel lblNewLabel_9 = new JLabel("Selecione o produto a ser modificado:");
		lblNewLabel_9.setFont(new Font("Ebrima", Font.BOLD, 14));

		JLabel lblNewLabel_9_1 = new JLabel("Defina novo nome e valor:");
		lblNewLabel_9_1.setFont(new Font("Ebrima", Font.BOLD, 14));
		GroupLayout gl_abaAtualizarProduto = new GroupLayout(abaAtualizarProduto);
		gl_abaAtualizarProduto.setHorizontalGroup(gl_abaAtualizarProduto.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_abaAtualizarProduto.createSequentialGroup().addGap(54).addComponent(lblNewLabel_9)
						.addContainerGap(554, Short.MAX_VALUE))
				.addGroup(gl_abaAtualizarProduto.createSequentialGroup().addGap(54)
						.addGroup(gl_abaAtualizarProduto
								.createParallelGroup(Alignment.LEADING).addComponent(nomeNovoProduto_1)
								.addComponent(valorNovoProduto_1).addComponent(lblNewLabel_5))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_abaAtualizarProduto.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_abaAtualizarProduto.createSequentialGroup()
										.addComponent(textField_1, 122, 122, 122).addGap(268))
								.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
								.addGroup(gl_abaAtualizarProduto.createSequentialGroup()
										.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 193,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
										.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 202,
												GroupLayout.PREFERRED_SIZE)))
						.addGap(124))
				.addGroup(gl_abaAtualizarProduto.createSequentialGroup().addGap(56).addGroup(gl_abaAtualizarProduto
						.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_9_1, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4_1, GroupLayout.PREFERRED_SIZE, 552, GroupLayout.PREFERRED_SIZE)
						.addGroup(
								gl_abaAtualizarProduto.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_abaAtualizarProduto.createSequentialGroup()
												.addComponent(nomeNovoProduto_1_1_1, GroupLayout.PREFERRED_SIZE, 83,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 122,
														GroupLayout.PREFERRED_SIZE)
												.addGap(325))
										.addGroup(gl_abaAtualizarProduto.createSequentialGroup()
												.addComponent(nomeNovoProduto_1_1, GroupLayout.PREFERRED_SIZE, 83,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addGroup(gl_abaAtualizarProduto.createParallelGroup(Alignment.LEADING)
														.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 390,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(btnAtualizar, Alignment.TRAILING,
																GroupLayout.PREFERRED_SIZE, 197,
																GroupLayout.PREFERRED_SIZE))
												.addGap(57))))
						.addGap(55)));
		gl_abaAtualizarProduto
				.setVerticalGroup(
						gl_abaAtualizarProduto.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_abaAtualizarProduto.createSequentialGroup().addContainerGap()
										.addComponent(lblNewLabel_4_1).addGap(46).addComponent(lblNewLabel_9).addGap(12)
										.addGroup(gl_abaAtualizarProduto.createParallelGroup(Alignment.BASELINE)
												.addComponent(comboBox, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblNewLabel_5).addComponent(btnNewButton_2))
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addGroup(gl_abaAtualizarProduto.createParallelGroup(Alignment.BASELINE)
												.addComponent(nomeNovoProduto_1)
												.addComponent(textField_2, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_abaAtualizarProduto.createParallelGroup(Alignment.BASELINE)
												.addComponent(valorNovoProduto_1).addComponent(textField_1,
														GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))
										.addGap(51).addComponent(lblNewLabel_9_1).addGap(18)
										.addGroup(gl_abaAtualizarProduto.createParallelGroup(Alignment.BASELINE)
												.addComponent(nomeNovoProduto_1_1)
												.addComponent(textField_4, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_abaAtualizarProduto.createParallelGroup(Alignment.BASELINE)
												.addComponent(textField_5, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(nomeNovoProduto_1_1_1).addComponent(btnAtualizar,
														GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE))
										.addGap(131)));
		abaAtualizarProduto.setLayout(gl_abaAtualizarProduto);

		JPanel abaNovoPedido = new JPanel();
		abaNovoPedido.setBackground(SystemColor.window);
		tabbedPane.addTab("Novo Pedido", null, abaNovoPedido, null);

		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(1, 1, 10, 10));

		JLabel lblNewLabel = new JLabel("Quantidade");

		JLabel lblNewLabel_1 = new JLabel("Produto");

		JLabel lblNewLabel_2 = new JLabel("Valor Unitário");

		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Novo Pedido");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Ebrima", Font.BOLD, 14));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "Produto 1", "Produto 2" }));

		JButton btnAdicionaNoCarrinho = new JButton("Adicionar");
		btnAdicionaNoCarrinho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		JList carrinho = new JList();
		carrinho.setFont(new Font("Ebrima", Font.BOLD, 18));
		carrinho.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		carrinho.setBackground(SystemColor.control);
		carrinho.setModel(new AbstractListModel() {
			String[] values = new String[] { "Produto 1", "Produto 2" };

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});

		JButton btnRemoveDoCarrinho = new JButton("Remover");

		JButton btnFinalizaCompra = new JButton("Finalizar");

		JLabel lblNewLabel_8 = new JLabel("Total");

		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);

		JLabel lblNewLabel_3_1 = new JLabel("Carrinho");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 18));

		JSeparator separator_1 = new JSeparator();
		separator_1.setAlignmentY(0.0f);
		separator_1.setAlignmentX(0.0f);
		GroupLayout gl_abaNovoPedido = new GroupLayout(abaNovoPedido);
		gl_abaNovoPedido.setHorizontalGroup(gl_abaNovoPedido.createParallelGroup(Alignment.LEADING).addGroup(
				Alignment.TRAILING,
				gl_abaNovoPedido.createSequentialGroup().addContainerGap().addGroup(gl_abaNovoPedido
						.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_abaNovoPedido.createSequentialGroup()
								.addGroup(gl_abaNovoPedido.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_1).addComponent(lblNewLabel_2))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_abaNovoPedido.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_abaNovoPedido.createSequentialGroup()
												.addComponent(textField, 197, 197, 197)
												.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(lblNewLabel)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(spinner, GroupLayout.PREFERRED_SIZE, 60,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED).addComponent(lblNewLabel_8)
												.addPreferredGap(ComponentPlacement.RELATED).addComponent(textField_3,
														GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
										.addComponent(comboBox_1, Alignment.TRAILING, 0, 512, Short.MAX_VALUE)
										.addComponent(btnAdicionaNoCarrinho, Alignment.TRAILING)
										.addComponent(separator_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 512,
												Short.MAX_VALUE)
										.addComponent(carrinho, GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
										.addComponent(lblNewLabel_3_1, GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
										.addGroup(Alignment.TRAILING,
												gl_abaNovoPedido.createSequentialGroup()
														.addComponent(btnRemoveDoCarrinho)
														.addPreferredGap(ComponentPlacement.RELATED, 346,
																Short.MAX_VALUE)
														.addComponent(btnFinalizaCompra)))))
						.addGap(50)));
		gl_abaNovoPedido.setVerticalGroup(gl_abaNovoPedido.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_abaNovoPedido.createSequentialGroup().addContainerGap().addComponent(lblNewLabel_3)
						.addGap(29)
						.addGroup(gl_abaNovoPedido.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_1)
								.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(
								ComponentPlacement.UNRELATED)
						.addGroup(gl_abaNovoPedido.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_2)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel)
								.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_8).addComponent(textField_3, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(btnAdicionaNoCarrinho).addGap(44)
						.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addGap(12).addComponent(carrinho, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addGroup(gl_abaNovoPedido.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnFinalizaCompra).addComponent(btnRemoveDoCarrinho))
						.addContainerGap(15, Short.MAX_VALUE)));
		abaNovoPedido.setLayout(gl_abaNovoPedido);

		JPanel abaListaPedidos = new JPanel();
		abaListaPedidos.setBackground(SystemColor.window);
		tabbedPane.addTab("Lista de Pedidos", null, abaListaPedidos, null);

		JButton btnNewButton = new JButton("Concluir");
		btnNewButton.setAlignmentY(Component.TOP_ALIGNMENT);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		JList list = new JList();
		list.setAlignmentY(Component.TOP_ALIGNMENT);
		list.setAlignmentX(Component.LEFT_ALIGNMENT);
		list.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		list.setBackground(SystemColor.control);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] { "Pedido 01", "Pedido 02", "Pedido 03" };

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});

		JLabel lblNewLabel_6 = new JLabel("Em andamento");
		lblNewLabel_6.setAlignmentY(Component.TOP_ALIGNMENT);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);

		JList list_1 = new JList();
		list_1.setAlignmentY(Component.TOP_ALIGNMENT);
		list_1.setAlignmentX(Component.LEFT_ALIGNMENT);
		list_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list_1.setModel(new AbstractListModel() {
			String[] values = new String[] { "Pedido 5", "Pedido 6" };

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		list_1.setBackground(SystemColor.menu);

		JLabel lblNewLabel_6_1 = new JLabel("Concluido");
		lblNewLabel_6_1.setAlignmentY(Component.TOP_ALIGNMENT);
		lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.BOLD, 14));

		JButton btnEntregar = new JButton("Entregar");
		btnEntregar.setAlignmentY(Component.TOP_ALIGNMENT);

		JSeparator separator = new JSeparator();
		separator.setAlignmentY(Component.TOP_ALIGNMENT);
		separator.setAlignmentX(Component.LEFT_ALIGNMENT);
		GroupLayout gl_abaListaPedidos = new GroupLayout(abaListaPedidos);
		gl_abaListaPedidos.setHorizontalGroup(gl_abaListaPedidos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_abaListaPedidos.createSequentialGroup().addGap(24).addGroup(gl_abaListaPedidos
						.createParallelGroup(Alignment.LEADING)
						.addComponent(btnEntregar, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
						.addComponent(lblNewLabel_6, GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
						.addComponent(list, GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
						.addComponent(list_1, GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
						.addComponent(separator, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
						.addComponent(lblNewLabel_6_1, GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE))
						.addContainerGap()));
		gl_abaListaPedidos.setVerticalGroup(gl_abaListaPedidos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_abaListaPedidos.createSequentialGroup().addContainerGap()
						.addComponent(lblNewLabel_6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addGap(14).addComponent(list, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGap(18).addComponent(separator, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(lblNewLabel_6_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(list_1, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE).addGap(18)
						.addComponent(btnEntregar).addGap(26)));
		abaListaPedidos.setLayout(gl_abaListaPedidos);
		GroupLayout groupLayout = new GroupLayout(frmJavalanches.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 791, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(577, Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 467, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(280, Short.MAX_VALUE)));

		JPanel abaCadastrar = new JPanel();
		abaCadastrar.setBackground(SystemColor.window);
		tabbedPane.addTab("Cadastrar\r\n", null, abaCadastrar, null);

		txtNovoProduto = new JTextField();
		txtNovoProduto.setName("");
		txtNovoProduto.setColumns(10);

		JLabel nomeNovoProduto = new JLabel("Nome");

		txtR = new JTextField();
		txtR.setText("R$ 0,00");
		txtR.setHorizontalAlignment(SwingConstants.LEFT);
		txtR.setColumns(10);

		JLabel valorNovoProduto = new JLabel("Valor");
		
		JButton confirmaCadastro = new JButton("Cadastrar");
		confirmaCadastro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String novoNome = txtNovoProduto.getName();
				String novoValorString = txtR.getName();
				Double novoValor = Double.valueOf(novoValorString);
				Lanches novoLanche = new Lanches(novoNome,novoValor);
				listaLanches.add(novoLanche);
			}
		});
		JLabel lblNewLabel_4 = new JLabel("Novo Produto");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_abaCadastrar = new GroupLayout(abaCadastrar);
		gl_abaCadastrar.setHorizontalGroup(gl_abaCadastrar.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_abaCadastrar.createSequentialGroup().addGap(53).addGroup(gl_abaCadastrar
						.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 578, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_abaCadastrar.createSequentialGroup()
								.addGroup(gl_abaCadastrar.createParallelGroup(Alignment.TRAILING)
										.addComponent(valorNovoProduto).addComponent(nomeNovoProduto))
								.addGap(18)
								.addGroup(gl_abaCadastrar.createParallelGroup(Alignment.LEADING, false)
										.addGroup(gl_abaCadastrar.createSequentialGroup()
												.addComponent(txtR, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(confirmaCadastro))
										.addComponent(txtNovoProduto, GroupLayout.PREFERRED_SIZE, 486,
												GroupLayout.PREFERRED_SIZE))))
						.addContainerGap(32, Short.MAX_VALUE)));
		gl_abaCadastrar.setVerticalGroup(gl_abaCadastrar.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_abaCadastrar.createSequentialGroup().addContainerGap()
						.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(gl_abaCadastrar.createParallelGroup(Alignment.BASELINE).addComponent(nomeNovoProduto)
								.addComponent(txtNovoProduto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_abaCadastrar.createParallelGroup(Alignment.BASELINE).addComponent(valorNovoProduto)
								.addComponent(txtR, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(confirmaCadastro))
						.addContainerGap(362, Short.MAX_VALUE)));
		abaCadastrar.setLayout(gl_abaCadastrar);
		frmJavalanches.getContentPane().setLayout(groupLayout);
	}
}
