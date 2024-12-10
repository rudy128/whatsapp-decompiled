package X;

import android.view.KeyEvent;
import android.view.View;
import com.whatsapp.conversation.EditMessageActivity;
import com.whatsapp.emojiedittext.EmojiEditTextBottomSheetDialogFragment;
import com.whatsapp.group.newgroup.NewGroup;
import com.whatsapp.mediacomposer.ui.caption.CaptionFragment;
import com.whatsapp.profile.ProfilePhotoReminder;

/* renamed from: X.4gk  reason: invalid class name and case insensitive filesystem */
public class C92094gk implements C107845ai {
    public final int A00;
    public final Object A01;

    public C92094gk(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void BmC() {
        View view;
        switch (this.A00) {
            case 0:
                view = ((EditMessageActivity) this.A01).A0G;
                if (view == null) {
                    C18070vi.A11("entry");
                    throw null;
                }
                break;
            case 2:
                AnonymousClass4aY r1 = (AnonymousClass4aY) this.A01;
                if (!r1.A2Q.Bg6()) {
                    view = r1.A3Z;
                    break;
                } else {
                    return;
                }
            case 4:
                view = ((C74763cR) this.A01).A03;
                break;
            case 5:
                C74873d3 r0 = (C74873d3) this.A01;
                r0.CFm();
                C107845ai r12 = r0.A05;
                if (r12 != null) {
                    C107365Zk r02 = r0.A09;
                    if (r02 == null || r02.Bf8()) {
                        r12.BmC();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                view = ((EmojiEditTextBottomSheetDialogFragment) this.A01).A06;
                break;
            case 7:
                view = ((CaptionFragment) this.A01).A26().A0B;
                break;
            case 8:
                view = ((NewGroup) this.A01).A08;
                break;
            case 9:
                view = (View) this.A01;
                break;
            case 10:
                view = ((ProfilePhotoReminder) this.A01).A03;
                break;
            case 11:
                view = ((AnonymousClass4P4) this.A01).A05;
                break;
            default:
                return;
        }
        view.dispatchKeyEvent(new KeyEvent(0, 67));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bf, code lost:
        r1.A0W(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        r0 = androidx.core.view.inputmethod.EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e5, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e9, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ef, code lost:
        X.C43251zV.A09(r0, r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        X.C43251zV.A09(r1, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BsW(int[] r4) {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x00da;
                case 1: goto L_0x00a1;
                case 2: goto L_0x0065;
                case 3: goto L_0x0011;
                case 4: goto L_0x005c;
                case 5: goto L_0x0043;
                case 6: goto L_0x003a;
                case 7: goto L_0x002f;
                case 8: goto L_0x00c3;
                case 9: goto L_0x00ea;
                case 10: goto L_0x0026;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r3.A01
            X.4P4 r0 = (X.AnonymousClass4P4) r0
            com.whatsapp.mentions.MentionableEntry r1 = r0.A05
        L_0x000b:
            r0 = 1024(0x400, float:1.435E-42)
        L_0x000d:
            X.C43251zV.A09(r1, r4, r0)
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r0 = r3.A01
            com.whatsapp.conversation.selection.SingleSelectedMessageActivity r0 = (com.whatsapp.conversation.selection.SingleSelectedMessageActivity) r0
            com.whatsapp.reactions.ReactionsTrayViewModel r1 = r0.A07
            if (r1 != 0) goto L_0x001d
            java.lang.String r0 = "reactionsTrayViewModel"
            goto L_0x00e5
        L_0x001d:
            java.lang.String r0 = X.C43251zV.A06(r4)
            X.C18070vi.A0X(r0)
            goto L_0x00bf
        L_0x0026:
            java.lang.Object r0 = r3.A01
            com.whatsapp.profile.ProfilePhotoReminder r0 = (com.whatsapp.profile.ProfilePhotoReminder) r0
            com.whatsapp.WaEditText r1 = r0.A03
            r0 = 25
            goto L_0x000d
        L_0x002f:
            java.lang.Object r0 = r3.A01
            com.whatsapp.mediacomposer.ui.caption.CaptionFragment r0 = (com.whatsapp.mediacomposer.ui.caption.CaptionFragment) r0
            com.whatsapp.mediacomposer.ui.caption.CaptionView r0 = r0.A26()
            com.whatsapp.mentions.MentionableEntry r1 = r0.A0B
            goto L_0x000b
        L_0x003a:
            java.lang.Object r0 = r3.A01
            com.whatsapp.emojiedittext.EmojiEditTextBottomSheetDialogFragment r0 = (com.whatsapp.emojiedittext.EmojiEditTextBottomSheetDialogFragment) r0
            com.whatsapp.WaEditText r1 = r0.A06
            int r0 = r0.A02
            goto L_0x000d
        L_0x0043:
            java.lang.Object r0 = r3.A01
            X.3d3 r0 = (X.C74873d3) r0
            r0.CFm()
            X.5ai r1 = r0.A05
            if (r1 == 0) goto L_0x0010
            X.5Zk r0 = r0.A09
            if (r0 == 0) goto L_0x0058
            boolean r0 = r0.Bf8()
            if (r0 == 0) goto L_0x0010
        L_0x0058:
            r1.BsW(r4)
            return
        L_0x005c:
            java.lang.Object r0 = r3.A01
            X.3cR r0 = (X.C74763cR) r0
            com.whatsapp.WaEditText r1 = r0.A03
            int r0 = r0.A0A
            goto L_0x000d
        L_0x0065:
            java.lang.Object r2 = r3.A01
            X.4aY r2 = (X.AnonymousClass4aY) r2
            X.5cQ r0 = r2.A2Q
            boolean r0 = r0.Bg6()
            if (r0 == 0) goto L_0x008f
            X.5cQ r0 = r2.A2Q
            com.whatsapp.reactions.ReactionsTrayViewModel r1 = r0.getReactionsTrayViewModel()
            X.C17960vV.A07(r1)
            java.lang.String r0 = X.C43251zV.A06(r4)
            r1.A0W(r0)
            X.5cQ r1 = r2.A2Q
            com.whatsapp.reactions.ReactionsTrayViewModel r0 = r1.getReactionsTrayViewModel()
            X.206 r0 = r0.A0M
            if (r0 == 0) goto L_0x00f3
            r1.CPY(r0)
            return
        L_0x008f:
            com.whatsapp.mentions.MentionableEntry r1 = r2.A3Z
            r0 = 0
            X.C43251zV.A09(r1, r4, r0)
            boolean r0 = X.AnonymousClass4aY.A26(r2)
            if (r0 != 0) goto L_0x0010
            com.whatsapp.mentions.MentionableEntry r0 = r2.A3Z
            r0.callOnClick()
            return
        L_0x00a1:
            java.lang.Object r2 = r3.A01
            X.3uU r2 = (X.AnonymousClass3uU) r2
            X.4kt r0 = r2.A00
            com.whatsapp.reactions.ReactionsTrayViewModel r0 = r0.A0p
            if (r0 == 0) goto L_0x0010
            X.1vp r0 = r0.A0F
            int r1 = X.C72463Mc.A0A(r0)
            r0 = 2
            if (r1 != r0) goto L_0x0010
            X.4kt r0 = r2.A00
            com.whatsapp.reactions.ReactionsTrayViewModel r1 = r0.A0p
            X.C17960vV.A07(r1)
            java.lang.String r0 = X.C43251zV.A06(r4)
        L_0x00bf:
            r1.A0W(r0)
            return
        L_0x00c3:
            java.lang.Object r1 = r3.A01
            com.whatsapp.group.newgroup.NewGroup r1 = (com.whatsapp.group.newgroup.NewGroup) r1
            com.whatsapp.WaEditText r0 = r1.A08
            r0.requestFocus()
            com.whatsapp.WaEditText r2 = r1.A08
            X.18O r1 = r1.A06
            X.18Q r0 = X.AnonymousClass18O.A1O
            int r0 = r1.A04(r0)
            X.C43251zV.A09(r2, r4, r0)
            return
        L_0x00da:
            r1 = 0
            java.lang.Object r0 = r3.A01
            com.whatsapp.conversation.EditMessageActivity r0 = (com.whatsapp.conversation.EditMessageActivity) r0
            com.whatsapp.mentions.MentionableEntry r0 = r0.A0G
            if (r0 != 0) goto L_0x00ef
            java.lang.String r0 = "entry"
        L_0x00e5:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x00ea:
            r1 = 0
            java.lang.Object r0 = r3.A01
            android.widget.EditText r0 = (android.widget.EditText) r0
        L_0x00ef:
            X.C43251zV.A09(r0, r4, r1)
            return
        L_0x00f3:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92094gk.BsW(int[]):void");
    }
}
