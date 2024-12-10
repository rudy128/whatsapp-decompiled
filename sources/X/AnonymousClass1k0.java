package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.util.Log;

/* renamed from: X.1k0  reason: invalid class name */
public class AnonymousClass1k0 implements ServiceConnection {
    public final /* synthetic */ ConversationsFragment A00;

    public AnonymousClass1k0(ConversationsFragment conversationsFragment) {
        this.A00 = conversationsFragment;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ConversationsFragment conversationsFragment = this.A00;
        conversationsFragment.A1Y = new C45822Bu(conversationsFragment);
        conversationsFragment.A2f.CGF(new C98554rL(this, 45));
        Log.i("conversations/gdrive-service-connected");
    }

    public void onServiceDisconnected(ComponentName componentName) {
        ConversationsFragment conversationsFragment = this.A00;
        conversationsFragment.A0z.A02(conversationsFragment.A1Y);
        Log.i("conversations/gdrive-service-disconnected");
    }
}
