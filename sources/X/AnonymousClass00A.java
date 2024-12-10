package X;

import com.whatsapp.AbstractConsumerAppShell;

/* renamed from: X.00A  reason: invalid class name */
public abstract class AnonymousClass00A extends AbstractConsumerAppShell implements AnonymousClass009 {
    public final AnonymousClass00K componentManager = new AnonymousClass00K(new AnonymousClass00J(this));
    public boolean injected = false;

    public final Object generatedComponent() {
        return this.componentManager.generatedComponent();
    }

    public void hiltInternalInject() {
        if (!this.injected) {
            this.injected = true;
            generatedComponent();
        }
    }

    public void onCreate() {
        hiltInternalInject();
        super.onCreate();
    }

    public final AnonymousClass00K componentManager() {
        return this.componentManager;
    }
}
