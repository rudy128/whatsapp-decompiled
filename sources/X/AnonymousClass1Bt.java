package X;

/* renamed from: X.1Bt  reason: invalid class name */
public abstract class AnonymousClass1Bt extends AnonymousClass1Bs {
    public static void A00(String str, String str2, String str3, AnonymousClass1Bk r6) {
        StringBuilder sb = new StringBuilder();
        sb.append("HMAC");
        sb.append(str);
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Mac.");
        sb2.append(obj);
        r6.BAv(sb2.toString(), str2);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Alg.Alias.Mac.HMAC-");
        sb3.append(str);
        r6.BAv(sb3.toString(), obj);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Alg.Alias.Mac.HMAC/");
        sb4.append(str);
        r6.BAv(sb4.toString(), obj);
        StringBuilder sb5 = new StringBuilder();
        sb5.append("KeyGenerator.");
        sb5.append(obj);
        r6.BAv(sb5.toString(), str3);
        StringBuilder sb6 = new StringBuilder();
        sb6.append("Alg.Alias.KeyGenerator.HMAC-");
        sb6.append(str);
        r6.BAv(sb6.toString(), obj);
        StringBuilder sb7 = new StringBuilder();
        sb7.append("Alg.Alias.KeyGenerator.HMAC/");
        sb7.append(str);
        r6.BAv(sb7.toString(), obj);
    }

    public static void A01(String str, AnonymousClass1C0 r3, AnonymousClass1Bk r4) {
        StringBuilder sb = new StringBuilder();
        sb.append("HMAC");
        sb.append(str);
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Alg.Alias.Mac.");
        sb2.append(r3);
        r4.BAv(sb2.toString(), obj);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Alg.Alias.KeyGenerator.");
        sb3.append(r3);
        r4.BAv(sb3.toString(), obj);
    }
}
