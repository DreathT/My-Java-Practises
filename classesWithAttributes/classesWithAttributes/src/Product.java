public class Product {

    // Attribute | Field
    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stockAmount;
    private String _color;
    private String _code;

    //getter
    public int get_id() {
        return _id;
    }

    //setter
    public void set_id(int id) {
        _id = id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String name) {
        this._name = name;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String description) {
        this._description = description;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double price) {
        this._price = price;
    }

    public int get_stockAmount() {
        return _stockAmount;
    }

    public void set_stockAmount(int stockAmount) {
        this._stockAmount = stockAmount;
    }

    public String get_color() {
        return _color;
    }

    public void set_color(String color) {
        this._color = color;
    }

    public String get_code() {
        return this._name.substring(0,1) + _id;
    }
}
