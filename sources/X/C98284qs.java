package X;

import com.whatsapp.conversation.comments.CommentActionsBottomSheet;
import com.whatsapp.messaging.ViewOnceViewerActivity;

/* renamed from: X.4qs  reason: invalid class name and case insensitive filesystem */
public class C98284qs implements AnonymousClass1TI {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C98284qs(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void accept(Object obj) {
        AnonymousClass4DB r0;
        Object obj2;
        C26671Ta r02;
        switch (this.A00) {
            case 0:
                C22821Di r2 = (C22821Di) this.A02;
                Boolean bool = (Boolean) obj;
                C18070vi.A0j(r2, bool);
                boolean A04 = ((AnonymousClass1TK) ((C31191fA) this.A01).A0B.get()).A04();
                boolean booleanValue = bool.booleanValue();
                if (A04) {
                    if (booleanValue) {
                        r0 = AnonymousClass4DB.HIDDEN_AND_LINKED;
                    } else {
                        r0 = AnonymousClass4DB.HIDDEN_AND_NOT_LINKED;
                    }
                } else if (booleanValue) {
                    r0 = AnonymousClass4DB.NOT_HIDDEN_AND_LINKED;
                } else {
                    r0 = AnonymousClass4DB.NO_DIALOG;
                }
                r2.invoke(r0);
                return;
            case 1:
                C31191fA r4 = (C31191fA) this.A01;
                C22821Di r3 = (C22821Di) this.A02;
                Boolean bool2 = (Boolean) obj;
                C18070vi.A0j(r3, bool2);
                if (bool2.booleanValue()) {
                    r4.A07.CGF(new AnonymousClass7RL(r4, r3, 34));
                    return;
                } else {
                    r3.invoke(C49402Qi.NO_BANNER);
                    return;
                }
            case 2:
                obj2 = this.A02;
                r02 = ((C55572g1) this.A01).A01;
                break;
            case 3:
                obj2 = this.A02;
                r02 = ((C203711w) this.A01).A0M;
                break;
            case 4:
                CommentActionsBottomSheet commentActionsBottomSheet = (CommentActionsBottomSheet) this.A01;
                AnonymousClass1BI r6 = (AnonymousClass1BI) this.A02;
                Boolean bool3 = (Boolean) obj;
                C18070vi.A0d(bool3, 2);
                C18100vl r32 = commentActionsBottomSheet.A0f;
                if (!((AnonymousClass1FU) r32.getValue()).Bed()) {
                    C18030ve r5 = commentActionsBottomSheet.A0M;
                    if (r5 != null) {
                        C134136q6 r22 = new C134136q6(r5, r6, "comment_actions_bottom_sheet", bool3.booleanValue());
                        r22.A00 = 0;
                        r22.A09 = false;
                        AnonymousClass206 r03 = commentActionsBottomSheet.A0T;
                        if (r03 != null) {
                            r22.A01 = r03.A0I();
                            r22.A06 = false;
                            r22.A08 = false;
                            AnonymousClass206 r04 = commentActionsBottomSheet.A0T;
                            if (r04 != null) {
                                r22.A02 = r04.A0v;
                                r22.A03 = new AnonymousClass7M2(commentActionsBottomSheet, 0);
                                ((AnonymousClass1FU) r32.getValue()).CMl(r22.A00());
                                return;
                            }
                        }
                        C18070vi.A11("message");
                    } else {
                        AnonymousClass3MW.A1A();
                    }
                    throw null;
                }
                return;
            default:
                ViewOnceViewerActivity viewOnceViewerActivity = (ViewOnceViewerActivity) this.A01;
                AnonymousClass206 r62 = (AnonymousClass206) this.A02;
                boolean A1Y = AnonymousClass000.A1Y(obj);
                if (!AnonymousClass4Yv.A02(viewOnceViewerActivity)) {
                    C18030ve r42 = viewOnceViewerActivity.A0E;
                    C18070vi.A0W(r42);
                    AnonymousClass205 r33 = r62.A0v;
                    AnonymousClass1BI r23 = r33.A00;
                    if (r23 != null) {
                        C134136q6 r1 = new C134136q6(r42, r23, "view_once_viewer", A1Y);
                        r1.A00 = 0;
                        r1.A09 = false;
                        r1.A01 = r62.A0I();
                        r1.A06 = false;
                        r1.A08 = false;
                        r1.A03 = new C99374si(viewOnceViewerActivity);
                        r1.A02 = r33;
                        C20098A7b.A01(r1.A00(), viewOnceViewerActivity.getSupportFragmentManager());
                        return;
                    }
                    throw C17880vN.A0g();
                }
                return;
        }
        r02.unregisterObserver(obj2);
    }
}
