package X;

import com.whatsapp.voicerecorder.DraftVoiceNotesCacheDailyCron$onDailyCronWithMessageStore$1;
import java.io.File;

/* renamed from: X.4m3  reason: invalid class name and case insensitive filesystem */
public final class C95324m3 implements AnonymousClass1L0 {
    public final C42431yA A00;
    public final AnonymousClass73X A01;
    public final C18600wl A02;
    public final AnonymousClass1OX A03;

    public /* synthetic */ void Bqg() {
    }

    public /* synthetic */ void Bqh() {
    }

    public void Bqi() {
        File[] listFiles;
        AnonymousClass73X r9 = this.A01;
        File A032 = AnonymousClass73X.A03(r9);
        if (!(A032 == null || (listFiles = A032.listFiles()) == null)) {
            for (File file : listFiles) {
                if (file.lastModified() + 604800000 <= System.currentTimeMillis()) {
                    C64062u9.A0Q(file);
                    r9.A00.A00(file.getName());
                    file.getName();
                }
            }
        }
        AnonymousClass3MW.A1X(this.A02, new DraftVoiceNotesCacheDailyCron$onDailyCronWithMessageStore$1(this, (C30391dr) null), this.A03);
    }

    public C95324m3(C42431yA r1, AnonymousClass73X r2, C18600wl r3, AnonymousClass1OX r4) {
        C18070vi.A0s(r2, r1, r4, r3);
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
    }
}
