package X;

import com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment;
import com.whatsapp.mediacomposer.doodle.expressions.ExpressionsShapeCreator$createStickerShape$1;
import com.whatsapp.status.playback.MessageReplyActivity;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.7MW  reason: invalid class name */
public class AnonymousClass7MW implements AnonymousClass88B {
    public final int A00;
    public final Object A01;

    public AnonymousClass7MW(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void C6w(AnonymousClass1BI r9, C1418377d r10, Integer num, int i) {
        List list;
        Object obj;
        int i2;
        List A10;
        AnonymousClass88B r1;
        AnonymousClass1BI r0;
        C1418377d r5 = r10;
        switch (this.A00) {
            case 0:
                C134106q3 r3 = (C134106q3) this.A01;
                AnonymousClass88B r02 = r3.A03;
                if (r02 != null) {
                    r02.C6w(r9, r10, num, i);
                    C111185ii r2 = r3.A0A;
                    if (r2 != null) {
                        list = AnonymousClass3MW.A10(r2.A02);
                    } else {
                        list = null;
                    }
                    if (r3.A09.A01() && list != null && !list.isEmpty()) {
                        C136766uM r12 = r3.A0B;
                        r12.A01();
                        if (r2 != null) {
                            obj = r2.A02.A06();
                        } else {
                            obj = null;
                        }
                        C17960vV.A07(obj);
                        if (r2 == null || (A10 = AnonymousClass3MW.A10(r2.A02)) == null) {
                            i2 = 0;
                        } else {
                            i2 = A10.size();
                        }
                        r12.A03(num, i, i2);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                C134166q9 r13 = (C134166q9) this.A01;
                AnonymousClass88B r03 = r13.A04;
                if (r03 != null) {
                    r03.C6w(r9, r10, num, i);
                    if (r13.A01()) {
                        C136766uM r22 = r13.A0G;
                        C17960vV.A07(r22);
                        r22.A01();
                        C111185ii r04 = r13.A0F;
                        C17960vV.A07(r04);
                        AnonymousClass1DT r14 = r04.A02;
                        C17960vV.A07(r14.A06());
                        r22.A03(num, i, C108975cc.A02(r14));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                if (r10 == null) {
                    C111835kV r15 = (C111835kV) this.A01;
                    if (r15.A0H.isEmpty()) {
                        C125906bs r05 = r15.A07;
                        if (r05 != null) {
                            StickerExpressionsFragment.A02(r05.A00);
                            return;
                        }
                        return;
                    }
                }
                C111835kV r23 = (C111835kV) this.A01;
                Map map = r23.A0H;
                if (map.containsKey(r10)) {
                    map.remove(r10);
                } else {
                    map.put(r10, num);
                }
                r23.A0X();
                C125906bs r06 = r23.A07;
                if (r06 != null) {
                    StickerExpressionsFragment.A03(r06.A00, map.size());
                    return;
                }
                return;
            case 3:
                if (r10 != null) {
                    AnonymousClass7JF r24 = (AnonymousClass7JF) this.A01;
                    C130376jK r4 = (C130376jK) r24.A0b.get();
                    AnonymousClass1FL r32 = r24.A0A;
                    C23381Fv lifecycle = r32.getLifecycle();
                    AnonymousClass82P r7 = new AnonymousClass82P(r24, r10);
                    C18070vi.A0d(lifecycle, 0);
                    AnonymousClass3MW.A1X(r4.A05, new ExpressionsShapeCreator$createStickerShape$1(r32, r4, r5, (C30391dr) null, r7), C37561pk.A00(lifecycle));
                    return;
                }
                return;
            case 7:
                AnonymousClass6CF r07 = (AnonymousClass6CF) this.A01;
                r1 = r07.A08;
                if (r1 != null) {
                    r0 = r07.A05;
                    break;
                } else {
                    return;
                }
            case 8:
                AnonymousClass6CG r08 = (AnonymousClass6CG) this.A01;
                r1 = r08.A04;
                if (r1 != null) {
                    r0 = r08.A02;
                    break;
                } else {
                    return;
                }
            default:
                MessageReplyActivity messageReplyActivity = (MessageReplyActivity) this.A01;
                HashMap hashMap = MessageReplyActivity.A1v;
                if (C108995ce.A1Z(messageReplyActivity)) {
                    AnonymousClass4Yv.A01(messageReplyActivity, 106);
                    return;
                } else {
                    messageReplyActivity.A05.CGF(new AnonymousClass3C5(messageReplyActivity, r10, num, 48));
                    return;
                }
        }
        r1.C6w(r0, r10, num, i);
    }
}
