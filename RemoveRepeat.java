/** 
 * aaa -> aa
 * aabb -> aab
 */
public class RemoveRepeat {

    String get(String str) {
        if (str == null || str.length() == 0) throw new RuntimeException();
        StringBuilder sb = new StringBuilder();
        char pre = ' ';
        boolean forward = false;
        boolean forwardTwo = false;
        char cur;
        for (int i = 0; i < str.length(); ++i) {
            cur = str.charAt(i);
            if (forward && pre == cur) continue;
            else if (forwardTwo && !forward && pre == cur) continue;
            else {
                forwardTwo = forward;
                if (pre == cur) forward = true;
                else forward = false;
                pre = cur;
                sb.append(cur);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        RemoveRepeat r = new RemoveRepeat();
        System.out.println(r.get("a"));
        System.out.println(r.get("abc"));
        System.out.println(r.get("aaa"));
        System.out.println(r.get("aabb"));
        System.out.println(r.get("aaabb"));
        System.out.println(r.get("aabbb"));
        System.out.println(r.get("aaaaa"));
        System.out.println(r.get("aabbcc"));
    }
}