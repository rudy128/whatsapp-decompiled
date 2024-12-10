package X;

/* renamed from: X.2mQ  reason: invalid class name and case insensitive filesystem */
public final class C59512mQ {
    public final C691736e A00;
    public final C691836f A01;
    public final C20944Aby A02;
    public final C692036h A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59512mQ) {
                C59512mQ r5 = (C59512mQ) obj;
                if (!C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((AnonymousClass001.A0k(this.A03) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + AnonymousClass001.A0k(this.A00)) * 31) + C17880vN.A02(this.A01);
    }

    public C59512mQ(C691736e r1, C691836f r2, C20944Aby aby, C692036h r4) {
        this.A03 = r4;
        this.A02 = aby;
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BotMessageInfoData(botMessageInfo=");
        A10.append(this.A03);
        A10.append(", botModelMetadata=");
        A10.append(this.A02);
        A10.append(", botMessageDisclaimer=");
        A10.append(this.A00);
        A10.append(", botRenderingMetaData=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
