package X;

/* renamed from: X.2MJ  reason: invalid class name */
public final class AnonymousClass2MJ extends C436420i {
    public int A00;

    public synchronized void A0i(String str) {
        try {
            this.A00 = Integer.valueOf(str).intValue();
        } catch (NumberFormatException e) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("FMessageSystemEphemeralSettingNotApplied/setData cannot convert data to int, data=");
            C17890vO.A13(str, A10, e);
            this.A00 = 0;
        }
        return;
    }
}
