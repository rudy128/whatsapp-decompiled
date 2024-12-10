package X;

import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.emoji.EmojiPopupFooter;
import com.whatsapp.gallery.MediaGalleryActivity;
import com.whatsapp.mentions.MentionPickerView;

/* renamed from: X.3XY  reason: invalid class name */
public class AnonymousClass3XY extends C39711tW {
    public final int A00;
    public final Object A01;

    public AnonymousClass3XY(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A03(RecyclerView recyclerView, int i) {
        EmojiPopupFooter emojiPopupFooter;
        AnonymousClass3OS r0;
        switch (this.A00) {
            case 0:
                if (i == 0) {
                    C79033uC r02 = (C79033uC) this.A01;
                    C216416v r3 = r02.A0C;
                    AnonymousClass205 r2 = r02.A04;
                    r3.A00.put(r2, C72463Mc.A0k(r2, r02.A01.getCurrentPosition()));
                    return;
                }
                return;
            case 2:
                MediaGalleryActivity mediaGalleryActivity = (MediaGalleryActivity) this.A01;
                MenuItem menuItem = mediaGalleryActivity.A04;
                if (menuItem != null && menuItem.isActionViewExpanded() && mediaGalleryActivity.getCurrentFocus() != null) {
                    InputMethodManager A0N = mediaGalleryActivity.A08.A0N();
                    C17960vV.A07(A0N);
                    A0N.hideSoftInputFromWindow(recyclerView.getWindowToken(), 2);
                    return;
                }
                return;
            case 3:
                C18070vi.A0d(recyclerView, 0);
                int i2 = 0;
                if (i == 0) {
                    C74873d3 r32 = (C74873d3) this.A01;
                    int height = r32.A07.getHeight();
                    if (r32.A03 > 0 && r32.A07.A00 > height / 2) {
                        i2 = height;
                    }
                    emojiPopupFooter = r32.A07;
                    if (i2 != emojiPopupFooter.A00) {
                        r0 = new AnonymousClass3OS(r32, i2);
                    } else {
                        return;
                    }
                } else if (i == 1 && recyclerView.computeVerticalScrollRange() <= recyclerView.getHeight()) {
                    C74873d3 r22 = (C74873d3) this.A01;
                    emojiPopupFooter = r22.A07;
                    if (emojiPopupFooter.A00 != 0) {
                        r0 = new AnonymousClass3OS(r22, 0);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                emojiPopupFooter.startAnimation(r0);
                return;
            case 4:
                if (i == 0) {
                    MentionPickerView.A02((MentionPickerView) this.A01);
                    return;
                }
                return;
            default:
                super.A03(recyclerView, i);
                return;
        }
    }

    public void A04(RecyclerView recyclerView, int i, int i2) {
        switch (this.A00) {
            case 1:
                Fragment fragment = (Fragment) this.A01;
                if (fragment.A0B != null) {
                    fragment.A0B.findViewById(2131435340).setVisibility(C72453Mb.A06(recyclerView.canScrollVertically(-1) ? 1 : 0));
                }
                if (fragment.A0B != null) {
                    fragment.A0B.findViewById(2131435339).setVisibility(C72453Mb.A06(recyclerView.canScrollVertically(1) ? 1 : 0));
                    return;
                }
                return;
            case 3:
                C18070vi.A0d(recyclerView, 0);
                C74873d3 r2 = (C74873d3) this.A01;
                if (i2 == 0) {
                    EmojiPopupFooter emojiPopupFooter = r2.A07;
                    if (emojiPopupFooter.A00 != 0) {
                        emojiPopupFooter.startAnimation(new AnonymousClass3OS(r2, 0));
                        r2.A03 = 0;
                        return;
                    }
                    return;
                }
                Animation animation = r2.A07.getAnimation();
                if (animation != null) {
                    animation.cancel();
                }
                EmojiPopupFooter emojiPopupFooter2 = r2.A07;
                emojiPopupFooter2.setTopOffset(emojiPopupFooter2.A00 + i2);
                r2.A03 = i2;
                return;
            default:
                super.A04(recyclerView, i, i2);
                return;
        }
    }
}
