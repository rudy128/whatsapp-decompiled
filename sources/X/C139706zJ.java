package X;

/* renamed from: X.6zJ  reason: invalid class name and case insensitive filesystem */
public final class C139706zJ {
    public final String A00;

    public C139706zJ(String str) {
        C18070vi.A0d(str, 5);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C139706zJ) {
                C139706zJ r5 = (C139706zJ) obj;
                if (!"abc".equals("abc") || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17890vO.A02(this.A00, -1424485282) * 31;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        C108975cc.A17(A10, "GenAIImagineGenerateImagesParams(actorId=");
        A10.append(", clientMutationId=");
        A10.append("abc");
        AnonymousClass000.A1G(A10, ", numImages=");
        C108975cc.A17(A10, ", previousPrompt=");
        A10.append(", prompt=");
        A10.append(this.A00);
        C108975cc.A17(A10, ", replyToUserId=");
        A10.append(", seed=");
        return AnonymousClass001.A1F((Object) null, A10);
    }

    public /* synthetic */ C139706zJ(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, AnonymousClass1Y1 r8, int i) {
        this.A00 = str4;
    }
}
