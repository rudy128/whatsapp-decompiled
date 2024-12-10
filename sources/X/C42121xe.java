package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.1xe  reason: invalid class name and case insensitive filesystem */
public interface C42121xe {
    TextEmojiLabel getContactNameView();

    View getContentView();

    Context getContext();

    WaTextView getDateView();

    boolean getUnreadImportantIndicatorInflated();

    WaImageView getUnreadImportantIndicatorView();

    boolean getUnreadIndicatorInflated();

    WaTextView getUnreadIndicatorView();

    void setLayoutParams(ViewGroup.LayoutParams layoutParams);
}
