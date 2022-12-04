public class CourierGenerator {

    public static Courier getNewValidCourier() {
        return new Courier("samurai", "samurai4789", "Pavel");
    }

    public static Courier getCourierWithExistingLogin() {
        return new Courier("samurai", "9874samurai", "Maksim");
    }

    public static Courier getCourierWithoutLogin(){
        return new Courier(null, "samurai4789", "Pavel");
    }

    public static Courier getCourierWithoutPassword(){
        return new Courier("samurai", null, "Pavel");
    }

    public static Courier getCourierWithoutName(){
        return new Courier("samurai", "samurai4789", null);
    }

}
