package step24.unterricht;
// Ein funktionales Interface ist ein Interface, das nur eine (1) abstrakte Methode bereitstellt.
// Funktionale Interfaces können beliebig viele default-Methoden beinhalten, aber nur eine abstrakte Methode!

// Functional Interfaces werden auch als SAM Interfaces bezeichet. SAM (Single Abstract Method) Interface.
@FunctionalInterface
public interface IOperation {
    int calculate(int zahl);
}
