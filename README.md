# HideTab (Forge 1.20.1)

Client-side mod that hides the player list shown when you hold **Tab**.

## Build

Requires JDK 17 and a Gradle wrapper (generate it once with `gradle wrapper --gradle-version 8.1.1` if the project has none).

    ./gradlew build

The jar is created at `build/libs/hidetab-1.0.0.jar`. Put it in your `.minecraft/mods` folder with Forge 1.20.1 (47.x) installed.

## Notes

- Client-only: works on any server, no server install needed.
- The mod cancels the vanilla `PLAYER_LIST` GUI overlay, so Tab shows nothing.
- To target another version, change the Forge version in `build.gradle`, `mods.toml` ranges and `pack_format`. On 1.20.5+ the event/overlay API differs (NeoForge uses `RenderGuiLayerEvent.Pre` with `VanillaGuiLayers.TAB_LIST`).
