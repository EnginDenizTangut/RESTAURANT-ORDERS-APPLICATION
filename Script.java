public class Script {

    public static void main(String[] args) {
        String [] orders = {"green curry","pad thai","gyoza","cucumber salad","pad see ew", "brown rice","red curry","salad rolls","kebab","hunkar begendi","sarma"};

        RestaurantOrders2 foodOrders = new RestaurantOrders2();

        foodOrders.assign(orders);

    }
}
