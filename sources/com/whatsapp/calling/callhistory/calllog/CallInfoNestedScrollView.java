package com.whatsapp.calling.callhistory.calllog;

import X.AnonymousClass3Ma;
import X.C108945cZ;
import X.C18070vi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.contact.photos.MultiContactThumbnail;

public final class CallInfoNestedScrollView extends NestedScrollView {
    public TextEmojiLabel A00;
    public TextEmojiLabel A01;
    public MultiContactThumbnail A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallInfoNestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
    }

    public void Byy(View view, int[] iArr, int i, int i2, int i3) {
        AnonymousClass3Ma.A1O(view, 0, iArr);
        if (canScrollVertically(1)) {
            A02();
        }
        if (i2 > 0) {
            if (canScrollVertically(1)) {
                scrollBy(0, i2);
                iArr[1] = i2;
                return;
            }
            A03();
        }
        super.Byy(view, iArr, i, i2, i3);
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        C18070vi.A0d(view, 0);
        if (canScrollVertically(1)) {
            A02();
        }
        if (f2 > 0.0f) {
            if (canScrollVertically(1)) {
                A0D((int) f2);
                return true;
            }
            A03();
        }
        return super.onNestedPreFling(view, f, f2);
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        if (canScrollVertically(1)) {
            A02();
        }
        if (i2 > i4 && !canScrollVertically(1)) {
            A03();
        }
        super.onScrollChanged(i, i2, i3, i4);
    }

    private final void A02() {
        TextEmojiLabel textEmojiLabel = this.A00;
        if (textEmojiLabel != null) {
            textEmojiLabel.setScaleY(1.0f);
        }
        MultiContactThumbnail multiContactThumbnail = this.A02;
        if (multiContactThumbnail != null) {
            multiContactThumbnail.setScaleX(1.0f);
        }
        MultiContactThumbnail multiContactThumbnail2 = this.A02;
        if (multiContactThumbnail2 != null) {
            multiContactThumbnail2.setScaleY(1.0f);
        }
        MultiContactThumbnail multiContactThumbnail3 = this.A02;
        if (multiContactThumbnail3 != null) {
            multiContactThumbnail3.setTranslationY(0.0f);
        }
        TextEmojiLabel textEmojiLabel2 = this.A01;
        if (textEmojiLabel2 != null) {
            textEmojiLabel2.setTranslationY(0.0f);
        }
    }

    private final void A03() {
        int i;
        TextEmojiLabel textEmojiLabel = this.A00;
        float f = 0.0f;
        if (textEmojiLabel != null) {
            textEmojiLabel.setScaleY(0.0f);
        }
        MultiContactThumbnail multiContactThumbnail = this.A02;
        if (multiContactThumbnail != null) {
            f = C108945cZ.A04(multiContactThumbnail);
        }
        TextEmojiLabel textEmojiLabel2 = this.A00;
        if (textEmojiLabel2 != null) {
            i = textEmojiLabel2.getHeight();
        } else {
            i = 0;
        }
        TextEmojiLabel textEmojiLabel3 = this.A01;
        if (textEmojiLabel3 != null) {
            textEmojiLabel3.setTranslationY((float) i);
        }
        MultiContactThumbnail multiContactThumbnail2 = this.A02;
        if (multiContactThumbnail2 != null) {
            multiContactThumbnail2.setTranslationY(((f / 2.0f) / 2.0f) + ((float) i));
        }
        MultiContactThumbnail multiContactThumbnail3 = this.A02;
        if (multiContactThumbnail3 != null) {
            multiContactThumbnail3.setScaleX(0.5f);
        }
        MultiContactThumbnail multiContactThumbnail4 = this.A02;
        if (multiContactThumbnail4 != null) {
            multiContactThumbnail4.setScaleY(0.5f);
        }
    }

    public final void setContactImage(MultiContactThumbnail multiContactThumbnail) {
        this.A02 = multiContactThumbnail;
    }

    public final void setContactSubtitle(TextEmojiLabel textEmojiLabel) {
        this.A00 = textEmojiLabel;
    }

    public final void setContactTitle(TextEmojiLabel textEmojiLabel) {
        this.A01 = textEmojiLabel;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallInfoNestedScrollView(Context context) {
        super(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallInfoNestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
    }
}
