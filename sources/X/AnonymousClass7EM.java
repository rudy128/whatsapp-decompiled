package X;

import com.whatsapp.contact.picker.SharedTextPreviewDialogFragment;
import com.whatsapp.mentions.MentionableEntry;

/* renamed from: X.7EM  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7EM implements AnonymousClass86s {
    public final /* synthetic */ SharedTextPreviewDialogFragment A00;

    public final void Bse() {
        SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment = this.A00;
        int selectionStart = sharedTextPreviewDialogFragment.A0D.getSelectionStart();
        if (selectionStart == sharedTextPreviewDialogFragment.A0D.getSelectionEnd() && sharedTextPreviewDialogFragment.A0S) {
            MentionableEntry mentionableEntry = sharedTextPreviewDialogFragment.A0D;
            int offsetForPosition = mentionableEntry.getOffsetForPosition(mentionableEntry.getX() + C108945cZ.A03(sharedTextPreviewDialogFragment.A0D), (float) sharedTextPreviewDialogFragment.A04.getScrollY());
            int A05 = C108945cZ.A05(sharedTextPreviewDialogFragment.A0D.getLayout().getLineTop(0), sharedTextPreviewDialogFragment.A0D.getLayout().getLineBottom(0));
            MentionableEntry mentionableEntry2 = sharedTextPreviewDialogFragment.A0D;
            int offsetForPosition2 = mentionableEntry2.getOffsetForPosition(mentionableEntry2.getX() + C108945cZ.A03(sharedTextPreviewDialogFragment.A0D), (float) (AnonymousClass3MW.A02(sharedTextPreviewDialogFragment.A04, sharedTextPreviewDialogFragment.A04.getScrollY()) - A05));
            if (selectionStart < offsetForPosition) {
                sharedTextPreviewDialogFragment.A0D.setSelection(offsetForPosition);
            } else if (selectionStart > offsetForPosition2) {
                sharedTextPreviewDialogFragment.A0D.setSelection(offsetForPosition2);
            }
        } else if (!sharedTextPreviewDialogFragment.A0S) {
            sharedTextPreviewDialogFragment.A0S = true;
        }
        SharedTextPreviewDialogFragment.A03(sharedTextPreviewDialogFragment);
    }

    public /* synthetic */ AnonymousClass7EM(SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment) {
        this.A00 = sharedTextPreviewDialogFragment;
    }
}
