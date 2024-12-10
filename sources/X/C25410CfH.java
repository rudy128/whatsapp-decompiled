package X;

import android.content.pm.Signature;
import android.os.Build;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.CfH  reason: case insensitive filesystem */
public abstract class C25410CfH {
    public static final C25764Cla A00 = new C25764Cla("PhoneskyVerificationUtils");

    public static boolean A00(Signature[] signatureArr) {
        int length;
        String str;
        if (signatureArr == null || (length = signatureArr.length) == 0) {
            A00.A03("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
            return false;
        }
        ArrayList A13 = AnonymousClass000.A13();
        int i = 0;
        while (i < length) {
            try {
                str = AnonymousClass8BT.A0x(AnonymousClass8BW.A1W(signatureArr[i].toByteArray(), "SHA-256"));
            } catch (NoSuchAlgorithmException unused) {
                str = "";
            }
            A13.add(str);
            if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str)) {
                String str2 = Build.TAGS;
                if ((!str2.contains("dev-keys") && !str2.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str)) {
                    i++;
                }
            }
            return true;
        }
        C25764Cla cla = A00;
        Object[] objArr = new Object[1];
        StringBuilder A10 = AnonymousClass000.A10();
        Iterator it = A13.iterator();
        if (it.hasNext()) {
            while (true) {
                A10.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                A10.append(", ");
            }
        }
        BE6.A1H(A10, objArr, 0);
        cla.A03(String.format("Play Store package certs are not valid. Found these sha256 certs: [%s].", objArr), new Object[0]);
        return false;
    }
}
