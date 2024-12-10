package X;

/* renamed from: X.1I1  reason: invalid class name */
public abstract /* synthetic */ class AnonymousClass1I1 {
    public static final long A00(String str, long j, long j2) {
        try {
            String property = System.getProperty(str);
            if (property != null) {
                Long A04 = AnonymousClass1YD.A04(property);
                if (A04 != null) {
                    long longValue = A04.longValue();
                    if (1 <= longValue && longValue <= j2) {
                        return longValue;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("System property '");
                    sb.append(str);
                    sb.append("' should be in range ");
                    sb.append(1);
                    sb.append("..");
                    sb.append(j2);
                    sb.append(", but is '");
                    sb.append(longValue);
                    sb.append('\'');
                    throw new IllegalStateException(sb.toString());
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("System property '");
                sb2.append(str);
                sb2.append("' has unrecognized value '");
                sb2.append(property);
                sb2.append('\'');
                throw new IllegalStateException(sb2.toString());
            }
        } catch (SecurityException unused) {
        }
        return j;
    }
}
