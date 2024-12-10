package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.preference.Preference;

public class AFA implements MenuItem.OnMenuItemClickListener, View.OnCreateContextMenuListener {
    public final Preference A00;

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Preference preference = this.A00;
        CharSequence A04 = preference.A04();
        if (preference.A0M && !TextUtils.isEmpty(A04)) {
            contextMenu.setHeaderTitle(A04);
            contextMenu.add(0, 0, 0, 2131889046).setOnMenuItemClickListener(this);
        }
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        Preference preference = this.A00;
        Context context = preference.A05;
        CharSequence A04 = preference.A04();
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Preference", A04));
        Toast.makeText(context, C17880vN.A0q(context, A04, new Object[1], 0, 2131899329), 0).show();
        return true;
    }

    public AFA(Preference preference) {
        this.A00 = preference;
    }
}
