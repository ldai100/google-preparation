public class NineTwoFive {


    // initial solution. This solution assumes all characters are valid;
    public boolean isLongPressedName(String name, String typed) {
        int top = 0, bottom = 0;
        while(top < name.length() && bottom < typed.length()) {
            char n = name.charAt(top);
            char t = typed.charAt(bottom);

            if(n == t) {
                top++;
                bottom++;
            }
            else {
                if(top == 0 || t != name.charAt(top - 1)) {
                    return false;
                }
                bottom++;
            }
        }
        return top == name.length();
    }
}
