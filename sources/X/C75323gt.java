package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.WaImageView;
import com.whatsapp.components.button.ThumbnailPickerButton;
import com.whatsapp.conversation.comments.ui.CommentContactPictureView;
import com.whatsapp.location.ContactLiveLocationThumbnail;
import com.whatsapp.status.ScalingContactStatusThumbnail;

/* renamed from: X.3gt  reason: invalid class name and case insensitive filesystem */
public abstract class C75323gt extends WaImageView {
    public boolean A00;

    public void A05() {
        if (this instanceof AnonymousClass3qJ) {
            AnonymousClass3qJ r1 = (AnonymousClass3qJ) this;
            if (r1 instanceof ScalingContactStatusThumbnail) {
                ScalingContactStatusThumbnail scalingContactStatusThumbnail = (ScalingContactStatusThumbnail) r1;
                if (!scalingContactStatusThumbnail.A00) {
                    scalingContactStatusThumbnail.A00 = true;
                    C72483Me.A0x(scalingContactStatusThumbnail);
                }
            } else if (!r1.A00) {
                r1.A00 = true;
                C72483Me.A0x(r1);
            }
        } else if (this instanceof ContactLiveLocationThumbnail) {
            ContactLiveLocationThumbnail contactLiveLocationThumbnail = (ContactLiveLocationThumbnail) this;
            if (!contactLiveLocationThumbnail.A03) {
                contactLiveLocationThumbnail.A03 = true;
                C72483Me.A0x(contactLiveLocationThumbnail);
            }
        } else if (this instanceof CommentContactPictureView) {
            CommentContactPictureView commentContactPictureView = (CommentContactPictureView) this;
            if (!commentContactPictureView.A06) {
                commentContactPictureView.A06 = true;
                AnonymousClass10E A0P = C72483Me.A0P(commentContactPictureView);
                commentContactPictureView.A01 = AnonymousClass3MZ.A0e(A0P);
                commentContactPictureView.A02 = AnonymousClass10E.A4z(A0P);
                commentContactPictureView.A04 = AnonymousClass3MZ.A1B(A0P);
                commentContactPictureView.A05 = AnonymousClass3MZ.A1C(A0P);
                commentContactPictureView.A00 = AnonymousClass10E.A17(A0P);
                commentContactPictureView.A03 = AnonymousClass3MZ.A0g(A0P);
            }
        } else if (this instanceof ThumbnailPickerButton) {
            ThumbnailPickerButton thumbnailPickerButton = (ThumbnailPickerButton) this;
            if (!thumbnailPickerButton.A00) {
                thumbnailPickerButton.A00 = true;
                C72483Me.A0x(thumbnailPickerButton);
            }
        } else if (this instanceof C77533qI) {
            C77533qI r12 = (C77533qI) this;
            if (!r12.A00) {
                r12.A00 = true;
                C72483Me.A0x(r12);
            }
        } else if (!this.A00) {
            this.A00 = true;
            C72483Me.A0x(this);
        }
    }

    public C75323gt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A05();
    }
}
