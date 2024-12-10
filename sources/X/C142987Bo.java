package X;

import android.view.KeyEvent;
import android.view.View;
import com.whatsapp.contact.picker.SharedTextPreviewDialogFragment;
import com.whatsapp.mediacomposer.ui.caption.CaptionFragment;
import com.whatsapp.notification.PopupNotification;
import com.whatsapp.status.playback.MessageReplyActivity;
import com.whatsapp.statuscomposer.composer.TextStatusComposerFragment;
import java.util.HashMap;

/* renamed from: X.7Bo  reason: invalid class name and case insensitive filesystem */
public class C142987Bo implements C107845ai {
    public final int A00;
    public final Object A01;

    public C142987Bo(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void BmC() {
        View view;
        switch (this.A00) {
            case 0:
                view = ((SharedTextPreviewDialogFragment) this.A01).A0D;
                break;
            case 1:
                view = ((C130696jr) this.A01).A07;
                break;
            case 2:
                CaptionFragment captionFragment = ((C109235d2) this.A01).A03;
                if (captionFragment == null || (view = captionFragment.A26().A0B) == null) {
                    return;
                }
            case 5:
                view = ((PopupNotification) this.A01).A0V;
                break;
            case 6:
                HashMap hashMap = MessageReplyActivity.A1v;
                view = ((MessageReplyActivity) this.A01).A0k;
                break;
            case 7:
                view = ((TextStatusComposerFragment) this.A01).A0l;
                if (view == null) {
                    C18070vi.A11("entry");
                    throw null;
                }
                break;
            default:
                return;
        }
        view.dispatchKeyEvent(new KeyEvent(0, 67));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ce, code lost:
        X.C43251zV.A09(r1, r9, androidx.core.view.inputmethod.EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00da, code lost:
        X.C43251zV.A09(r1, r9, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00de, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        throw null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BsW(int[] r9) {
        /*
            r8 = this;
            int r0 = r8.A00
            r7 = r9
            switch(r0) {
                case 0: goto L_0x00d4;
                case 1: goto L_0x00c8;
                case 2: goto L_0x00b4;
                case 3: goto L_0x0089;
                case 4: goto L_0x0078;
                case 5: goto L_0x006b;
                case 6: goto L_0x0059;
                case 7: goto L_0x004d;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r6 = r8.A01
            com.whatsapp.textstatus.AddTextStatusActivity r6 = (com.whatsapp.textstatus.AddTextStatusActivity) r6
            X.3d3 r0 = r6.A05
            if (r0 != 0) goto L_0x0015
            java.lang.String r0 = "emojiPopup"
        L_0x0010:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0015:
            r0.dismiss()
            X.10I r2 = r6.A05
            r1 = 9
            X.7RD r0 = new X.7RD
            r0.<init>(r9, r6, r1)
            r2.CGN(r0)
            X.5z5 r0 = new X.5z5
            r0.<init>(r9)
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            int[] r4 = r0.A01
            int r3 = r4.length
            r2 = 0
        L_0x0031:
            if (r2 >= r3) goto L_0x0040
            r1 = r4[r2]
            r0 = 65039(0xfe0f, float:9.1139E-41)
            if (r1 == r0) goto L_0x003d
            r5.appendCodePoint(r1)
        L_0x003d:
            int r2 = r2 + 1
            goto L_0x0031
        L_0x0040:
            java.lang.String r0 = X.C18070vi.A0H(r5)
            r6.A0D = r0
            com.whatsapp.wds.components.button.WDSButton r1 = r6.A09
            if (r1 != 0) goto L_0x00c3
            java.lang.String r0 = "clearButton"
            goto L_0x0010
        L_0x004d:
            r1 = 0
            java.lang.Object r0 = r8.A01
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment r0 = (com.whatsapp.statuscomposer.composer.TextStatusComposerFragment) r0
            com.whatsapp.status.widget.StatusEditText r0 = r0.A0l
            if (r0 != 0) goto L_0x00df
            java.lang.String r0 = "entry"
            goto L_0x0010
        L_0x0059:
            java.lang.Object r1 = r8.A01
            com.whatsapp.status.playback.MessageReplyActivity r1 = (com.whatsapp.status.playback.MessageReplyActivity) r1
            java.util.HashMap r0 = com.whatsapp.status.playback.MessageReplyActivity.A1v
            X.74M r0 = r1.A14
            if (r0 == 0) goto L_0x0068
            X.72K r0 = r0.A0J
            if (r0 == 0) goto L_0x0068
            return
        L_0x0068:
            com.whatsapp.mentions.MentionableEntry r1 = r1.A0k
            goto L_0x00da
        L_0x006b:
            java.lang.Object r1 = r8.A01
            com.whatsapp.notification.PopupNotification r1 = (com.whatsapp.notification.PopupNotification) r1
            X.74M r0 = r1.A15
            X.72K r0 = r0.A0J
            if (r0 != 0) goto L_0x00c7
            X.3ro r1 = r1.A0V
            goto L_0x00da
        L_0x0078:
            java.lang.Object r0 = r8.A01
            com.whatsapp.mediaview.MediaViewFragment r0 = (com.whatsapp.mediaview.MediaViewFragment) r0
            com.whatsapp.reactions.ReactionsTrayViewModel r1 = r0.A13
            X.C17960vV.A07(r1)
            java.lang.String r0 = X.C43251zV.A06(r9)
            r1.A0W(r0)
            return
        L_0x0089:
            java.lang.Object r2 = r8.A01
            X.7JF r2 = (X.AnonymousClass7JF) r2
            X.00H r0 = r2.A0b
            java.lang.Object r4 = r0.get()
            X.6jK r4 = (X.C130376jK) r4
            X.1FL r3 = r2.A0A
            X.1Fv r1 = r3.getLifecycle()
            X.82Q r6 = new X.82Q
            r6.<init>(r2, r9)
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.1pm r1 = X.C37561pk.A00(r1)
            X.0wl r0 = r4.A05
            r5 = 0
            com.whatsapp.mediacomposer.doodle.expressions.ExpressionsShapeCreator$createEmojiShape$1 r2 = new com.whatsapp.mediacomposer.doodle.expressions.ExpressionsShapeCreator$createEmojiShape$1
            r2.<init>(r3, r4, r5, r6, r7)
            X.AnonymousClass3MW.A1X(r0, r2, r1)
            return
        L_0x00b4:
            java.lang.Object r0 = r8.A01
            X.5d2 r0 = (X.C109235d2) r0
            com.whatsapp.mediacomposer.ui.caption.CaptionFragment r0 = r0.A03
            if (r0 == 0) goto L_0x00c7
            com.whatsapp.mediacomposer.ui.caption.CaptionView r0 = r0.A26()
            com.whatsapp.mentions.MentionableEntry r1 = r0.A0B
            goto L_0x00ce
        L_0x00c3:
            r0 = 1
            r1.setEnabled(r0)
        L_0x00c7:
            return
        L_0x00c8:
            java.lang.Object r0 = r8.A01
            X.6jr r0 = (X.C130696jr) r0
            com.whatsapp.mentions.MentionableEntry r1 = r0.A07
        L_0x00ce:
            r0 = 1024(0x400, float:1.435E-42)
            X.C43251zV.A09(r1, r9, r0)
            return
        L_0x00d4:
            java.lang.Object r0 = r8.A01
            com.whatsapp.contact.picker.SharedTextPreviewDialogFragment r0 = (com.whatsapp.contact.picker.SharedTextPreviewDialogFragment) r0
            com.whatsapp.mentions.MentionableEntry r1 = r0.A0D
        L_0x00da:
            r0 = 0
            X.C43251zV.A09(r1, r9, r0)
            return
        L_0x00df:
            X.C43251zV.A09(r0, r9, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C142987Bo.BsW(int[]):void");
    }
}
