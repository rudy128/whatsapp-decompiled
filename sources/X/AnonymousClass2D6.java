package X;

import android.content.Context;
import android.widget.ImageView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

/* renamed from: X.2D6  reason: invalid class name */
public class AnonymousClass2D6 extends C42461yD implements C42471yE {
    public C139106yE A00;
    public final Context A01;
    public final C37451pZ A02;
    public final C34021jm A03;
    public final C18000vb A04;
    public final AnonymousClass1Nb A05;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass2D6(android.content.Context r30, X.AnonymousClass11S r31, X.C32191gn r32, X.C37551pj r33, X.AnonymousClass1M9 r34, X.C24921Me r35, X.C37451pZ r36, X.C34021jm r37, X.C42071xZ r38, X.AnonymousClass11C r39, X.AnonymousClass11P r40, X.AnonymousClass118 r41, X.C18000vb r42, X.AnonymousClass1CJ r43, X.AnonymousClass1NA r44, X.C42351y2 r45, X.C18030ve r46, X.AnonymousClass12L r47, X.C42211xo r48, X.C32091gc r49, X.AnonymousClass1QO r50, X.AnonymousClass1QS r51, X.AnonymousClass1R2 r52, X.C42341y1 r53, X.AnonymousClass1Nb r54, X.AnonymousClass1PU r55, X.C43351zf r56, X.AnonymousClass00H r57, X.AnonymousClass00H r58) {
        /*
            r29 = this;
            r27 = r57
            r2 = r30
            r3 = r31
            r5 = r33
            r6 = r34
            r7 = r35
            r8 = r37
            r9 = r38
            r10 = r39
            r11 = r40
            r12 = r41
            r4 = r32
            r28 = r58
            r1 = r29
            r13 = r42
            r14 = r43
            r15 = r44
            r16 = r45
            r17 = r46
            r18 = r47
            r19 = r48
            r20 = r49
            r21 = r50
            r22 = r51
            r23 = r52
            r24 = r53
            r25 = r55
            r26 = r56
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r1.A01 = r2
            r1.A04 = r13
            r0 = r54
            r1.A05 = r0
            r0 = r36
            r1.A02 = r0
            r1.A03 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2D6.<init>(android.content.Context, X.11S, X.1gn, X.1pj, X.1M9, X.1Me, X.1pZ, X.1jm, X.1xZ, X.11C, X.11P, X.118, X.0vb, X.1CJ, X.1NA, X.1y2, X.0ve, X.12L, X.1xo, X.1gc, X.1QO, X.1QS, X.1R2, X.1y1, X.1Nb, X.1PU, X.1zf, X.00H, X.00H):void");
    }

    public void CRM(UserJid userJid, C139106yE r5) {
        C39211sh r1;
        this.A00 = r5;
        ImageView imageView = this.A06.A04;
        if (imageView instanceof WDSProfilePhoto) {
            WDSProfilePhoto wDSProfilePhoto = (WDSProfilePhoto) imageView;
            boolean A032 = AnonymousClass73K.A03(r5, false);
            wDSProfilePhoto.setStatusIndicatorEnabled(A032);
            if (A032) {
                if (r5.A01 > 0) {
                    r1 = C39211sh.UNSEEN;
                } else {
                    r1 = C39211sh.SEEN_CHATLIST;
                }
                wDSProfilePhoto.setProfileStatus(new C39231sj(r1));
            }
        }
    }
}
