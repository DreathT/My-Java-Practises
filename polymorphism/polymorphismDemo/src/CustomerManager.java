public class CustomerManager {

    private BaseLogger _logger;

    public CustomerManager(BaseLogger logger) {
        this._logger = logger;
    }

    public void add() {
        System.out.println("Musteri eklendi");
        this._logger.log("log mesaji");
    }

}
