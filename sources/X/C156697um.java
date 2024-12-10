package X;

import android.net.Uri;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;

/* renamed from: X.7um  reason: invalid class name and case insensitive filesystem */
public final class C156697um extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C110125ey $webView;
    public final /* synthetic */ C1412875a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C156697um(C110125ey r2, C1412875a r3) {
        super(0);
        this.this$0 = r3;
        this.$webView = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C1412875a r1 = this.this$0;
        C110125ey r0 = this.$webView;
        r1.A00 = r0;
        if (r0 != null) {
            r0.getSettings().setJavaScriptEnabled(true);
            C110125ey r2 = this.this$0.A00;
            if (r2 != null) {
                r2.evaluateJavascript("\n(function () {\n    if (window.WhatsAppBridge) {\n        return;\n    }\n\n    var responseCallbacks = {};\n    var port;\n    window.addEventListener('message', function (event) {\n        if (event.data == 'init-port') {\n            if (event.ports[0] != null) {\n                port = event.ports[0];\n                port.onmessage = function (event) {\n                    handleMessage(event.data)\n                };\n            }\n        }\n    }, false);\n\n    function invoke(method, data, responseCallback) {\n        dispatchMessage({webview_token: __fbAndroidBridgeAuthToken, method: method, data: data }, responseCallback);\n    }\n\n    function dispatchMessage(message, responseCallback) {\n        if (responseCallback) {\n            var callbackID = Math.random().toString(36)\n            responseCallbacks[callbackID] = responseCallback;\n            message['callbackID'] = callbackID;\n        }\n\n        port.postMessage(JSON.stringify(message))\n    }\n\n    function handleMessage(messageJSON) {\n        var message = JSON.parse(messageJSON);\n        var responseCallback;\n\n        if (message.callbackID) {\n            responseCallback = responseCallbacks[message.callbackID];\n            delete responseCallbacks[message.callbackID];\n\n            if (!responseCallback) {\n                return;\n            }\n            if (!message.responseData) {\n                responseCallback()\n            } else {\n                responseCallback(message.responseData);\n            }\n        }\n    }\n\n    if (typeof __fbAndroidBridgeAuthToken !== 'undefined') {\n            window.WhatsAppBridge = {\n            invoke: invoke,\n        };\n    } else {\n    window.addEventListener(\"__fbAndroidBridgeAuthTokenInjected\", function (){\n         window.WhatsAppBridge = {\n            invoke: invoke,\n        };\n    });\n    }\n })();\n", new AnonymousClass79G(1));
                WebMessagePort[] createWebMessageChannel = this.$webView.createWebMessageChannel();
                C18070vi.A0X(createWebMessageChannel);
                C1412875a r12 = this.this$0;
                WebMessagePort webMessagePort = createWebMessageChannel[0];
                C18070vi.A0U(webMessagePort);
                r12.A01 = webMessagePort;
                C1412875a r22 = this.this$0;
                WebMessagePort A00 = r22.A01;
                if (A00 == null) {
                    C18070vi.A11("sendPort");
                    throw null;
                }
                A00.setWebMessageCallback(new C110115ex(r22));
                C110125ey r3 = this.this$0.A00;
                if (r3 != null) {
                    r3.postWebMessage(new WebMessage("init-port", new WebMessagePort[]{createWebMessageChannel[1]}), Uri.EMPTY);
                    return C27621Wu.A00;
                }
            }
        }
        C18070vi.A11("secureWebView");
        throw null;
    }
}
