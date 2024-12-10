package X;

import android.app.Activity;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.0Kk  reason: invalid class name and case insensitive filesystem */
public abstract class C03730Kk {
    public static boolean A00(Activity activity, DragEvent dragEvent, View view) {
        activity.requestDragAndDropPermissions(dragEvent);
        AnonymousClass1HF.A0A(view, new C25709Ckf(dragEvent.getClipData(), 3).A00());
        return true;
    }

    /* JADX INFO: finally extract failed */
    public static boolean A01(Activity activity, DragEvent dragEvent, TextView textView) {
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            AnonymousClass1HF.A0A(textView, new C25709Ckf(dragEvent.getClipData(), 3).A00());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }
}
