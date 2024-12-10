package X;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.mediaview.PhotoView;
import com.whatsapp.newsletter.ui.profilephoto.ViewNewsletterProfilePhoto;

public final /* synthetic */ class AQQ implements C43451zp {
    public final /* synthetic */ ViewNewsletterProfilePhoto A00;
    public final /* synthetic */ boolean A01;

    public final void BpK(Object obj) {
        String str;
        String str2;
        boolean z = this.A01;
        ViewNewsletterProfilePhoto viewNewsletterProfilePhoto = this.A00;
        Bitmap bitmap = (Bitmap) obj;
        int i = 8;
        if (bitmap != null || z) {
            PhotoView photoView = viewNewsletterProfilePhoto.A0B;
            if (photoView != null) {
                photoView.setVisibility(0);
                TextView textView = viewNewsletterProfilePhoto.A02;
                if (textView != null) {
                    textView.setVisibility(8);
                    View view = viewNewsletterProfilePhoto.A00;
                    if (view != null) {
                        C46162Dk A03 = ViewNewsletterProfilePhoto.A03(viewNewsletterProfilePhoto);
                        if ((A03 == null || (str2 = A03.A0V) == null || str2.length() == 0) && !z) {
                            i = 0;
                        }
                        view.setVisibility(i);
                        ImageView imageView = viewNewsletterProfilePhoto.A01;
                        if (imageView != null) {
                            imageView.setVisibility(0);
                            if (bitmap != null) {
                                PhotoView photoView2 = viewNewsletterProfilePhoto.A0B;
                                if (photoView2 != null) {
                                    photoView2.A0A(bitmap);
                                    ImageView imageView2 = viewNewsletterProfilePhoto.A01;
                                    if (imageView2 != null) {
                                        imageView2.setImageBitmap(bitmap);
                                        return;
                                    }
                                }
                            } else {
                                return;
                            }
                        }
                        str = "animationView";
                        C18070vi.A11(str);
                        throw null;
                    }
                }
                str = "messageView";
                C18070vi.A11(str);
                throw null;
            }
            str = "pictureView";
            C18070vi.A11(str);
            throw null;
        }
        PhotoView photoView3 = viewNewsletterProfilePhoto.A0B;
        if (photoView3 != null) {
            photoView3.setVisibility(8);
            View view2 = viewNewsletterProfilePhoto.A00;
            if (view2 != null) {
                view2.setVisibility(8);
                TextView textView2 = viewNewsletterProfilePhoto.A02;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                    ImageView imageView3 = viewNewsletterProfilePhoto.A01;
                    if (imageView3 != null) {
                        imageView3.setVisibility(8);
                        TextView textView3 = viewNewsletterProfilePhoto.A02;
                        if (textView3 != null) {
                            textView3.setText(2131892961);
                            return;
                        }
                    }
                    str = "animationView";
                    C18070vi.A11(str);
                    throw null;
                }
                str = "messageView";
                C18070vi.A11(str);
                throw null;
            }
        }
        str = "pictureView";
        C18070vi.A11(str);
        throw null;
        str = "progressView";
        C18070vi.A11(str);
        throw null;
    }

    public /* synthetic */ AQQ(ViewNewsletterProfilePhoto viewNewsletterProfilePhoto, boolean z) {
        this.A01 = z;
        this.A00 = viewNewsletterProfilePhoto;
    }
}
