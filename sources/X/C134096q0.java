package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.6q0  reason: invalid class name and case insensitive filesystem */
public final class C134096q0 {
    public final AnonymousClass1KB A00;
    public final C25321Nt A01;
    public final C24681Lg A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final C25931Qe A06;
    public final AnonymousClass00H A07;

    public final void A00(C25550Cho cho, C25550Cho cho2, CM2 cm2, C441822l r13, String str, String str2, List list, int i) {
        boolean z;
        C18070vi.A0d(r13, 0);
        try {
            CM2 cm22 = cm2;
            if (C18070vi.A18(cm2, C24120Bvm.A00)) {
                z = true;
            } else if (C18070vi.A18(cm2, C24119Bvl.A00) || C18070vi.A18(cm2, C24127Bvt.A00)) {
                z = false;
            } else {
                z = r13.A02;
            }
            r13.A02 = z;
            C62572rc r1 = r13.A02;
            if (r1 == null) {
                Log.e("TranscriptionManager/updateTranscription failed: transcriptions can only be updated for messages with mediaDataV2");
            } else {
                String str3 = str;
                A01(r13, new C1586981r(str), false);
                List list2 = list;
                r13.A1I(list2);
                ((C131576lK) this.A05.get()).A00(r13);
                r1.A0P = str2;
                this.A01.A05(r13);
                if (list == null || list2.size() <= 0) {
                    r13.A0X(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
                } else {
                    r13.A0V(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
                }
                C17880vN.A0c(this.A03).A05(r13, -1);
                A01(r13, new AnonymousClass83E(cho, cho2, cm22, str3, i), false);
            }
            AnonymousClass7RN.A00(this.A00, this, r13, 2);
            ((AnonymousClass1QB) this.A04.get()).CQy(r13);
        } catch (Exception e) {
            Log.e("TranscriptionManager/updateTranscription failed", e);
            throw e;
        } catch (Throwable th) {
            AnonymousClass7RN.A00(this.A00, this, r13, 2);
            ((AnonymousClass1QB) this.A04.get()).CQy(r13);
            throw th;
        }
    }

    public final void A01(C441822l r11, C22821Di r12, boolean z) {
        AnonymousClass229 r1;
        C25931Qe r2 = this.A06;
        AnonymousClass25F r0 = r11.A00;
        C18070vi.A0W(r0);
        r2.A0A(r0);
        AnonymousClass229 r02 = r0.A02;
        if (r02 == null) {
            C24127Bvt bvt = C24127Bvt.A00;
            C24100BvS bvS = C24100BvS.A00;
            r1 = new AnonymousClass7LG(bvS, bvS, bvt, (String) null, (byte[]) null, 0, 0, false);
        } else {
            r1 = r02;
        }
        AnonymousClass7LG r3 = (AnonymousClass7LG) r12.invoke(r1);
        if (!C18070vi.A18(r3, r02)) {
            r11.A1H(r3);
            ((CY4) this.A07.get()).A00(r3, r11.A0x);
            if (z) {
                AnonymousClass7RN.A00(this.A00, this, r11, 2);
            }
        }
    }

    public C134096q0(AnonymousClass1KB r1, C25321Nt r2, C24681Lg r3, C25931Qe r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8) {
        C18070vi.A0w(r1, r3, r5, r4, r2);
        C18070vi.A0q(r6, r7, r8);
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r5;
        this.A06 = r4;
        this.A01 = r2;
        this.A07 = r6;
        this.A05 = r7;
        this.A04 = r8;
    }
}
