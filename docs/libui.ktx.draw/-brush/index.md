[libui.ktx.draw](../index.md) / [Brush](./index.md)

# Brush

`class Brush : `[`Disposable`](../../libui.ktx/-disposable/index.md)`<`[`uiDrawBrush`](../../libui/ui-draw-brush/index.md)`>`

Defines the color(s) to draw a path with.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Brush()`<br>Defines the color(s) to draw a path with. |

### Inherited Properties

| Name | Summary |
|---|---|
| [disposed](../../libui.ktx/-disposable/disposed.md) | `val disposed: Boolean`<br>Returns `true` if object was disposed - in this case [dispose](../../libui.ktx/-disposable/dispose.md) will do nothing, all other operations are invalid and will `throw Error("Resource is disposed")`. |

### Functions

| Name | Summary |
|---|---|
| [linear](linear.md) | `fun linear(start: `[`Point`](../-point/index.md)`, end: `[`Point`](../-point/index.md)`, vararg stops: Pair<Double, `[`Color`](../-color/index.md)`>): `[`Brush`](./index.md)<br>Helper to quickly create linear brush |
| [radial](radial.md) | `fun radial(start: `[`Point`](../-point/index.md)`, center: `[`Point`](../-point/index.md)`, radius: Double, vararg stops: Pair<Double, `[`Color`](../-color/index.md)`>): `[`Brush`](./index.md)<br>Helper to quickly create radial brush |
| [solid](solid.md) | `fun solid(color: `[`Color`](../-color/index.md)`, opacity: Double = 1.0): `[`Brush`](./index.md)<br>`fun solid(rgb: Int, alpha: Double = 1.0): `[`Brush`](./index.md)<br>Helper to quickly set a brush color |

### Inherited Functions

| Name | Summary |
|---|---|
| [dispose](../../libui.ktx/-disposable/dispose.md) | `open fun dispose(): Unit`<br>Dispose and free all allocated native resources. |
