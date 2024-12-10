package X;

/* renamed from: X.4GV  reason: invalid class name */
public abstract class AnonymousClass4GV {
    public static final AnonymousClass4DN A00(Integer num) {
        for (AnonymousClass4DN r2 : AnonymousClass4DN.values()) {
            int i = r2.value;
            if (num != null && i == num.intValue()) {
                return r2;
            }
        }
        return null;
    }
}
