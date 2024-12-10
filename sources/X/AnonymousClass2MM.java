package X;

/* renamed from: X.2MM  reason: invalid class name */
public final class AnonymousClass2MM extends C436420i {
    public int A00;
    public String A01;
    public boolean A02;

    public void A0i(String str) {
        String[] split = str.split(",");
        for (int i = 0; i < split.length; i++) {
            String str2 = split[i];
            if (i == 0) {
                this.A01 = str2;
            } else if (i != 1) {
                C17900vP.A0i("FMessageSystemLinkedGroupCallStart/setData index out of bounds: ", AnonymousClass000.A10(), i);
                return;
            } else {
                this.A00 = Integer.parseInt(str2);
            }
        }
    }
}
