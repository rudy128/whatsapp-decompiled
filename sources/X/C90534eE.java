package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.group.GroupProfileEmojiEditor;

/* renamed from: X.4eE  reason: invalid class name and case insensitive filesystem */
public class C90534eE implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ GroupProfileEmojiEditor A04;

    public C90534eE(GroupProfileEmojiEditor groupProfileEmojiEditor, int i, int i2, int i3, int i4) {
        this.A04 = groupProfileEmojiEditor;
        this.A02 = i;
        this.A03 = i2;
        this.A00 = i3;
        this.A01 = i4;
    }

    public void onGlobalLayout() {
        View view;
        BottomSheetBehavior bottomSheetBehavior;
        int i;
        int A0R;
        int min;
        GroupProfileEmojiEditor groupProfileEmojiEditor = this.A04;
        AnonymousClass3MY.A1D(groupProfileEmojiEditor.A01, this);
        int height = groupProfileEmojiEditor.A01.getHeight() - groupProfileEmojiEditor.getSupportActionBar().A09();
        int i2 = ((height - this.A02) - (this.A03 * 2)) - this.A00;
        int i3 = height / 2;
        BottomSheetBehavior bottomSheetBehavior2 = groupProfileEmojiEditor.A05;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.A0C = Math.max(i3, i2);
            int i4 = this.A01;
            if (i2 < i4) {
                min = Math.max(i2, i3);
            } else {
                min = Math.min(i4, i3);
            }
            bottomSheetBehavior2.A0Y(min, false);
        }
        if (groupProfileEmojiEditor.A02 != null && (view = groupProfileEmojiEditor.A01) != null && (bottomSheetBehavior = groupProfileEmojiEditor.A05) != null && (i = bottomSheetBehavior.A0J) != 5) {
            if (i == 3) {
                A0R = bottomSheetBehavior.A0C;
            } else {
                A0R = bottomSheetBehavior.A0R();
            }
            GroupProfileEmojiEditor.A0Q(groupProfileEmojiEditor, A0R, (view.getHeight() - groupProfileEmojiEditor.getSupportActionBar().A09()) - A0R);
        }
    }
}
