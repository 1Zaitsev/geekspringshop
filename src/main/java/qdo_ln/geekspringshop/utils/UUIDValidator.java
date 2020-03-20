package qdo_ln.geekspringshop.utils;

public class UUIDValidator {

    public static boolean isValidUUID(String uuid) {
        boolean result = false;
        if(uuid.matches("[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[34][0-9a-fA-F]{3}-[89ab][0-9a-fA-F]{3}-[0-9a-fA-F]{12}")){
            result = true;
        }
        return result;
    }
}
