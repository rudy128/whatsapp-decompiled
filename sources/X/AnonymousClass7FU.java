package X;

import com.whatsapp.botinfra.message.memory.BotMemoryMetadataRepository;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.7FU  reason: invalid class name */
public final class AnonymousClass7FU implements AnonymousClass1WS {
    public final /* synthetic */ BotMemoryMetadataRepository A00;
    public final /* synthetic */ AnonymousClass206 A01;
    public final /* synthetic */ C31761g5 A02;

    public /* synthetic */ void BmY(AnonymousClass206 r1, int i) {
    }

    public /* synthetic */ void BsP(AnonymousClass206 r1) {
    }

    public /* synthetic */ void Bwj(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void ByG(AnonymousClass206 r1) {
    }

    public void ByH(AnonymousClass206 r4, int i) {
        Object obj;
        C18070vi.A0d(r4, 0);
        if (C18070vi.A18(this.A01.A0v.A01, r4.A0v.A01)) {
            C108965cb.A1L(this.A00.A03, this);
            C31761g5 r2 = this.A02;
            if (r2.Be2()) {
                try {
                    obj = Long.valueOf(r4.A0x);
                } catch (Throwable th) {
                    obj = C108945cZ.A1J(th);
                }
                r2.resumeWith(obj);
            }
        }
    }

    public /* synthetic */ void ByK(AnonymousClass206 r1, int i) {
    }

    public /* synthetic */ void ByN(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByQ(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public /* synthetic */ void ByR(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByY(Collection collection, int i) {
        AnonymousClass2TK.A00(this, collection, i);
    }

    public /* synthetic */ void ByZ(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void Bya(Collection collection, Map map) {
    }

    public /* synthetic */ void Byb(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void Byc(AnonymousClass1BI r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void Byd(Collection collection) {
    }

    public /* synthetic */ void Bz8(C29681ch r1) {
    }

    public /* synthetic */ void Bz9(AnonymousClass206 r1) {
    }

    public /* synthetic */ void BzA(C29681ch r1, boolean z) {
    }

    public /* synthetic */ void BzC(C29681ch r1) {
    }

    public /* synthetic */ void C0d(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public /* synthetic */ void C0h(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public AnonymousClass7FU(BotMemoryMetadataRepository botMemoryMetadataRepository, AnonymousClass206 r2, C31761g5 r3) {
        this.A01 = r2;
        this.A00 = botMemoryMetadataRepository;
        this.A02 = r3;
    }
}
