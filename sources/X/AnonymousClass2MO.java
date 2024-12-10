package X;

/* renamed from: X.2MO  reason: invalid class name */
public class AnonymousClass2MO extends C436420i {
    public long A00;
    public long A01;
    public String A02;

    public void A0i(String str) {
        String[] split = str.split(",");
        for (int i = 0; i < split.length; i++) {
            String str2 = split[i];
            if (i == 0) {
                this.A01 = Long.parseLong(str2);
            } else if (i == 1) {
                this.A00 = Long.parseLong(str2);
            } else if (i != 2) {
                C17900vP.A0i("FMessageSystemScheduledCallStart/setData index out of bounds: ", AnonymousClass000.A10(), i);
                return;
            } else {
                this.A02 = str2;
            }
        }
    }
}
