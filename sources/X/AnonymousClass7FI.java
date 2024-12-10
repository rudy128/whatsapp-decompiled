package X;

import com.whatsapp.media.transcode.MediaTranscodeService;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7FI  reason: invalid class name */
public class AnonymousClass7FI implements AnonymousClass1WR {
    public int A00 = -1;
    public final /* synthetic */ MediaTranscodeService A01;

    public /* synthetic */ void BmY(AnonymousClass206 r1, int i) {
    }

    public /* synthetic */ void BsP(AnonymousClass206 r1) {
    }

    public /* synthetic */ void Bwj(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void ByG(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByH(AnonymousClass206 r1, int i) {
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

    public AnonymousClass7FI(MediaTranscodeService mediaTranscodeService) {
        this.A01 = mediaTranscodeService;
    }

    public void ByK(AnonymousClass206 r4, int i) {
        HashMap hashMap = MediaTranscodeService.A0B;
        synchronized (hashMap) {
            if (hashMap.containsKey(r4.A0v)) {
                MediaTranscodeService.A00(this.A01, this.A00);
            }
        }
    }
}
