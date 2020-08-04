import java.util.HashMap;
import java.util.Map;

public enum EmpCode {
    ASSOCIATE(10001),
    SENIOR_ASSOCIATE(10002),
    MANAGER(10003),
    SENIOR_MANAGER(10004);

    private final int value;
    private static Map<Integer, EmpCode> map = new HashMap<>();

    EmpCode(final int newValue) {
        value = newValue;
    }

    static {
        for (EmpCode empCode : EmpCode.values()) {
            map.put(empCode.value, empCode);
        }
    }

    public int getValue() { return value; }

    public static EmpCode getEnum(int code) {
        EmpCode res = (EmpCode) map.get(code); 
        if(res== null){
            throw new IllegalArgumentException("Exception");
        } else {
            return res;
        }
    }
}