package me.iron.mapPlus.mod;

import api.DebugFile;
import api.listener.events.controller.ClientInitializeEvent;
import api.mod.StarMod;

public class ModMain extends StarMod {
    //dont do anything, overwrite of GameMapDrawer is automatic.

    @Override
    public void onClientCreated(ClientInitializeEvent clientInitializeEvent) {
        super.onClientCreated(clientInitializeEvent);
        DebugFile.log("MapPlus active on client.",this);
    }
}
