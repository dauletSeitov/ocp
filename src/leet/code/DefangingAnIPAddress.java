package leet.code;

public class DefangingAnIPAddress {
    public static void main(String[] args) {

    }

    public String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }

}
