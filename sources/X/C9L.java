package X;

import android.net.Uri;

public abstract class C9L {
    public static C25256Cbv A00(String str) {
        String scheme;
        Uri A01 = C26215Cuu.A01(str);
        C25955CpN cpN = new C25955CpN();
        C26208Cuj.A01(A01);
        cpN.A00 = A01;
        cpN.A03 = C25786Clx.A04;
        if (A01 != null) {
            Uri uri = C20012A3c.A00;
            if ("res".equals(A01.getScheme())) {
                if (!cpN.A00.isAbsolute()) {
                    throw new C27205DZe("Resource URI path must be absolute.");
                } else if (!cpN.A00.getPath().isEmpty()) {
                    try {
                        Integer.parseInt(cpN.A00.getPath().substring(1));
                    } catch (NumberFormatException unused) {
                        throw new C27205DZe("Resource URI path must be a resource id.");
                    }
                } else {
                    throw new C27205DZe("Resource URI must not be empty");
                }
            }
            Uri uri2 = cpN.A00;
            if (uri2 == null) {
                scheme = null;
            } else {
                scheme = uri2.getScheme();
            }
            if (!"asset".equals(scheme) || cpN.A00.isAbsolute()) {
                return new C25256Cbv(cpN);
            }
            throw new C27205DZe("Asset URI path must be absolute.");
        }
        throw new C27205DZe("Source must be set!");
    }
}
