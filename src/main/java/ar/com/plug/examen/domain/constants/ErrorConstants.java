package ar.com.plug.examen.domain.constants;

public final class ErrorConstants {
    public static final String INVALID_PRODUCT_PARAMETERS_ERROR_CODE = "PARAMETROS_INVALIDOS/VACIOS";
    public static final String INVALID_PRODUCT_FIELD = "Los siguientes parametros son obligatorios: descriptionProduct, category, price Y stock por favor revisar ";
    public static final String PRODUCT_NOT_FOUND_ERROR_CODE = "PRODUCTO_NO_ENCONTRADO";
    public static final String PRODUCT_NOT_FOUND_ERROR_MESSAGE = "El producto ingresado no fue encontrado en base de datos";
    public static final String API_ERROR = "Se ha producido un error inesperado en el consumo de la aplicación";
    public static final String INVALID_CUSTOMER_PARAMETERS_ERROR_CODE = "PARAMETROS_INVALIDOS/VACIOS";
    public static final String INVALID_CUSTOMER_FIELD = "Los siguientes parametros son obligatorios: name, lastName, email, phone y documentNumber por favor revisar ";
    public static final String CUSTOMER_NOT_FOUND_ERROR_CODE = "CLIENTE_NO_ENCONTRADO";
    public static final String CUSTOMER_NOT_FOUND_ERROR_MESSAGE = "El cliente ingresado no fue encontrado en base de datos";
    public static final String SELLER_NOT_FOUND_ERROR_CODE = "Vendedor_NO_ENCONTRADO";
    public static final String SELLER_NOT_FOUND_ERROR_MESSAGE = "El vendedor ingresado no fue encontrado en base de datos";
    public static final String SAVE_SUCCESS = "Se guardo correctamente el producto con id ";
    public static final String ERROR_DATA_EMPTY = "Se presento un error en el producto con categoria y nombre de producto ";
    public static final String ERROR_UNKNOW = "Se presento un error desconocido con la aplicaicón, por favor revise ";
    public static final String ERROR_EXIST_PRODUCT = "Ya existe el producto con categoria y nombre de producto ";
    public static final String ERROR_EMPTY_ID = "No existe el producto con id  ";
    public static final String DELETE_SUCCESS = "Se elimino correctamente el producto con id ";
    public static final String EDIT_SUCCESS = "Se edito correctamente el producto con id ";
}
