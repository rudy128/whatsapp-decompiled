package X;

import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.2xj  reason: invalid class name and case insensitive filesystem */
public final class C66162xj implements AnonymousClass191 {
    public final C18030ve A00;
    public final WhatsAppLibLoader A01;
    public final Set A02;

    public final synchronized void A00(C49492Qr r6) {
        C17960vV.A01();
        Set set = this.A02;
        if (!set.contains(r6)) {
            try {
                WhatsAppLibLoader whatsAppLibLoader = this.A01;
                String[] A1Y = C17880vN.A1Y();
                A1Y[0] = r6.libName;
                String str = A1Y[0];
                if (Boolean.FALSE.equals(whatsAppLibLoader.A00) || !C224319w.A03(whatsAppLibLoader.A03, str)) {
                    whatsAppLibLoader.A07.get();
                    whatsAppLibLoader.A01(str);
                }
            } catch (UnsatisfiedLinkError e) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("DynamicLibraryLoader/maybeLoadLibrary ");
                A10.append(r6.libName);
                C17890vO.A13(" failed", A10, e);
            }
            set.add(r6);
        }
    }

    public /* synthetic */ void Blg() {
    }

    public void Blf() {
        C18030ve r2 = this.A00;
        C18040vf r1 = C18040vf.A02;
        if (C18020vd.A05(r1, r2, 5527)) {
            A00(C49492Qr.OPUS_MLOW);
        }
        if (C18020vd.A05(r1, r2, 5989)) {
            A00(C49492Qr.AOM);
        }
        if (C18020vd.A05(r1, r2, 12404)) {
            A00(C49492Qr.WZAV1);
        }
    }

    public C66162xj(C18030ve r2, WhatsAppLibLoader whatsAppLibLoader) {
        C18070vi.A0j(whatsAppLibLoader, r2);
        this.A01 = whatsAppLibLoader;
        this.A00 = r2;
        Set synchronizedSet = Collections.synchronizedSet(C17880vN.A12());
        C18070vi.A0X(synchronizedSet);
        this.A02 = synchronizedSet;
    }

    public void Ba9() {
    }
}
