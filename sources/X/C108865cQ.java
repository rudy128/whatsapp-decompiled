package X;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.reactions.ReactionsTrayViewModel;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.5cQ  reason: invalid class name and case insensitive filesystem */
public interface C108865cQ extends C108875cR, C108885cS, AnonymousClass8A7, C108295bS, AnonymousClass5YT, C36211nW, AnonymousClass5Z9, BAG, C107985aw, C107995ax, C23201Fc, C23211Fd, C107395Zn, C107435Zr, C23221Fe, AnonymousClass86U, C23231Ff {
    AnonymousClass5YU BHg();

    void BIi(AnonymousClass205 r1);

    boolean Be3();

    boolean Bg6();

    void Biu(short s);

    void Biz(String str);

    void BmU();

    void Bqk();

    void C3A();

    void C7p();

    void C7q(Bundle bundle);

    Dialog C7r(int i);

    boolean C7s(Menu menu);

    boolean C7u(int i, KeyEvent keyEvent);

    boolean C7v(int i, KeyEvent keyEvent);

    boolean C7w(Menu menu);

    void C7y();

    void C7z();

    void CE4(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter);

    void CEx();

    AnonymousClass1FY CFa();

    void CMl(DialogFragment dialogFragment);

    void CNA(int i);

    void CNh(Intent intent, int i);

    AnonymousClass02B COJ(AnonymousClass02H r1);

    boolean COm(MotionEvent motionEvent);

    Object COn(Class cls);

    void CPW(List list, int i);

    View findViewById(int i);

    void finish();

    void finishAndRemoveTask();

    C18030ve getAbProps();

    AnonymousClass1FY getActivityNullable();

    AnonymousClass1L9 getActivityUtils();

    C37721q1 getAddContactLogUtil();

    C26911Ty getBusinessProfileManager();

    C34511kb getCommunityChatManager();

    C30191dX getContactAccessHelper();

    AnonymousClass1M9 getContactManager();

    C27201Vd getContactPhotos();

    View getContentView();

    AnonymousClass4SX getConversationRowCustomizers();

    C88524a2 getConversationRowInflater();

    AnonymousClass122 getCoreMessageStore();

    AnonymousClass190 getCrashLogs();

    AnonymousClass1KW getEmojiLoader();

    EmojiSearchProvider getEmojiSearchProvider();

    AnonymousClass1W6 getFMessageDatabase();

    C218617r getFMessageIO();

    AnonymousClass4NU getFirstDrawMonitor();

    Collection getForwardMessages();

    AnonymousClass1KB getGlobalUI();

    AnonymousClass126 getGroupChatManager();

    AnonymousClass1PU getGroupChatUtils();

    AnonymousClass1MZ getGroupParticipantsManager();

    C19880zA getHostedGroupUtilsOptional();

    AnonymousClass1L4 getImeUtils();

    Intent getIntent();

    AnonymousClass1HB getInteractionPerfTracker();

    LayoutInflater getLayoutInflater();

    C23381Fv getLifecycle();

    AnonymousClass1F9 getLifecycleOwner();

    C36401np getLinkifier();

    C32011gU getLinkifyWeb();

    ListView getListView();

    AnonymousClass11S getMeManager();

    C134196qC getMessageAudioPlayerFactory();

    C31131f4 getMessageAudioPlayerProvider();

    PopupWindow.OnDismissListener getOnPopupWindowDismissListener();

    AnonymousClass19T getQuickPerformanceLogger();

    ReactionsTrayViewModel getReactionsTrayViewModel();

    AnonymousClass1CM getRegistrationStateManager();

    Resources getResources();

    AnonymousClass1FE getSavedStateRegistryOwner();

    AnonymousClass1LD getScreenLockStateProvider();

    HashSet getSeenMessages();

    AnonymousClass4S9 getSelectedMessages();

    AnonymousClass02B getSelectionActionMode();

    AnonymousClass18O getServerProps();

    AnonymousClass1Bd getStartupTracker();

    AnonymousClass11Z getStorageUtils();

    String getString(int i);

    String getString(int i, Object... objArr);

    C003401n getSupportActionBar();

    AnonymousClass1GP getSupportFragmentManager();

    C42211xo getSuspensionManager();

    AnonymousClass11C getSystemServices();

    AnonymousClass11P getTime();

    C33251iW getUserActions();

    AnonymousClass1FD getViewModelStoreOwner();

    C24921Me getWAContactNames();

    AnonymousClass118 getWAContext();

    C219217x getWaPermissionsHelper();

    C19830z4 getWaSharedPreferences();

    AnonymousClass10I getWaWorkers();

    AnonymousClass18K getWamRuntime();

    Window getWindow();

    WindowManager getWindowManager();

    boolean hasWindowFocus();

    void invalidateOptionsMenu();

    boolean isFinishing();

    boolean isInMultiWindowMode();

    boolean isTaskRoot();

    void overridePendingTransition(int i, int i2);

    void setContentView(int i);

    void setSelectionActionMode(AnonymousClass02B r1);

    void setSupportActionBar(Toolbar toolbar);

    void startActivity(Intent intent);

    void startActivityForResult(Intent intent, int i);

    void unregisterReceiver(BroadcastReceiver broadcastReceiver);
}
