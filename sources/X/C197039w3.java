package X;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: X.9w3  reason: invalid class name and case insensitive filesystem */
public abstract class C197039w3 {
    public static final String A00 = A5Z.A01("PackageManagerHelper");

    public static void A00(Context context, Class cls, boolean z) {
        String str = "enabled";
        try {
            String name = cls.getName();
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, name));
            boolean z2 = false;
            if (componentEnabledSetting != 0) {
                z2 = C17890vO.A1R(componentEnabledSetting);
            }
            if (z == z2) {
                A5Z A002 = A5Z.A00();
                String str2 = A00;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Skipping component enablement for ");
                AnonymousClass8BW.A16(A002, name, str2, A10);
                return;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, name), C72453Mb.A04(z ? 1 : 0), 1);
            A5Z A003 = A5Z.A00();
            String str3 = A00;
            StringBuilder A11 = AnonymousClass000.A11(name);
            A11.append(" ");
            String str4 = "disabled";
            if (z) {
                str4 = str;
            }
            AnonymousClass8BW.A16(A003, str4, str3, A11);
        } catch (Exception e) {
            A5Z A004 = A5Z.A00();
            String str5 = A00;
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append(cls.getName());
            A102.append("could not be ");
            if (!z) {
                str = "disabled";
            }
            A004.A07(str5, AnonymousClass000.A0y(str, A102), e);
        }
    }
}
