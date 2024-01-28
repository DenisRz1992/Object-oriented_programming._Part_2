package TransportService;

public abstract class MotorTransport extends WheledTransport {
    public MotorTransport (String modelName, int wheeelsCount) { super(modelName, wheeelsCount);}
    public void checkEngine () {
        System.out.println("Проверяем двигатель");
    }
    @Override
    public void service () {
        super.service();
        checkEngine();
    }
}
