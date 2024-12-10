package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.Ac9  reason: case insensitive filesystem */
public final class C20955Ac9 implements AnonymousClass229 {
    public boolean A00;
    public final Integer A01;
    public final String A02;
    public final List A03;
    public final Map A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20955Ac9) {
                C20955Ac9 ac9 = (C20955Ac9) obj;
                if (!C18070vi.A18(this.A03, ac9.A03) || !C18070vi.A18(this.A01, ac9.A01) || this.A00 != ac9.A00 || !C18070vi.A18(this.A04, ac9.A04) || !C18070vi.A18(this.A02, ac9.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass0DV.A00(((AnonymousClass001.A0k(this.A03) * 31) + AnonymousClass001.A0k(this.A01)) * 31, this.A00) + AnonymousClass001.A0k(this.A04)) * 31) + C108955ca.A06(this.A02);
    }

    public C20955Ac9(Integer num, String str, List list, Map map, boolean z) {
        this.A03 = list;
        this.A01 = num;
        this.A00 = z;
        this.A04 = map;
        this.A02 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BotSuggestedPromptMetadata(prompts=");
        A10.append(this.A03);
        A10.append(", selectedPromptIndex=");
        A10.append(this.A01);
        A10.append(", impressionLogged=");
        A10.append(this.A00);
        A10.append(", botPromptSuggestionMap=");
        A10.append(this.A04);
        A10.append(", selectedPromptId=");
        return C17900vP.A0B(this.A02, A10);
    }
}
