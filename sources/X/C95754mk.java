package X;

import android.graphics.drawable.Drawable;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.4mk  reason: invalid class name and case insensitive filesystem */
public final class C95754mk implements C72233Ld {
    public final /* synthetic */ C79063uI A00;

    public C95754mk(C79063uI r1) {
        this.A00 = r1;
    }

    public void Bsl() {
        C79063uI r1 = this.A00;
        String A0P = r1.getFMessage().A0P();
        if (A0P != null) {
            AnonymousClass2P1 highResolutionEmojiDrawableCache = r1.getHighResolutionEmojiDrawableCache();
            ReentrantLock reentrantLock = (ReentrantLock) highResolutionEmojiDrawableCache.A01.getValue();
            reentrantLock.lock();
            try {
                highResolutionEmojiDrawableCache.A00.A05(A0P);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public /* bridge */ /* synthetic */ void C2Y(Object obj) {
        Drawable A002;
        C79063uI r5 = this.A00;
        String A0P = r5.getFMessage().A0P();
        if (A0P != null && (A002 = C79063uI.A00(r5, (C72233Ld) null)) != null) {
            r5.A0S.A0J(new C21467AkY(r5, A002, A0P, 10));
        }
    }
}
