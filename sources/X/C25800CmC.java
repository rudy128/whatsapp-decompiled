package X;

import java.util.LinkedHashMap;

/* renamed from: X.CmC  reason: case insensitive filesystem */
public final class C25800CmC {
    public final C4I A00;
    public final C194909sU A01;
    public final C24266ByP A02;
    public final CharSequence A03;
    public final C18090vk A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25800CmC) {
                C25800CmC cmC = (C25800CmC) obj;
                if (!C18070vi.A18(this.A03, cmC.A03) || !C18070vi.A18(this.A00, cmC.A00) || !C18070vi.A18(this.A04, cmC.A04) || !C18070vi.A18(this.A01, cmC.A01) || this.A02 != cmC.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        String str;
        AnonymousClass1D6[] r3 = new AnonymousClass1D6[5];
        String str2 = "null";
        if (this.A03 != null) {
            str = "[String]";
        } else {
            str = str2;
        }
        C72463Mc.A1H("text", str, r3);
        C108985cd.A1G("statusLine", this.A00, r3);
        C72463Mc.A1I("showMore", this.A04, r3);
        if (this.A01 != null) {
            str2 = "[FeedbackPromptViewProps]";
        }
        C72463Mc.A1J("feedbackPromptProps", str2, r3);
        AnonymousClass8BW.A1L("timestampLocation", this.A02, r3);
        LinkedHashMap A0B = AnonymousClass1D7.A0B(r3);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TranscriptionViewModel.ViewProps(");
        return C17900vP.A0B(C29431cG.A0h(", ", A0B.entrySet(), C28151DsB.A00), A10);
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, ((((((AnonymousClass001.A0k(this.A03) * 31) + AnonymousClass001.A0k(this.A00)) * 31) + AnonymousClass001.A0k(this.A04)) * 31) + C17880vN.A02(this.A01)) * 31);
    }

    public C25800CmC(C4I c4i, C194909sU r2, C24266ByP byP, CharSequence charSequence, C18090vk r5) {
        this.A03 = charSequence;
        this.A00 = c4i;
        this.A04 = r5;
        this.A01 = r2;
        this.A02 = byP;
    }

    public C25800CmC() {
        this((C4I) null, (C194909sU) null, C24266ByP.AUDIO_METADATA, (CharSequence) null, (C18090vk) null);
    }
}
