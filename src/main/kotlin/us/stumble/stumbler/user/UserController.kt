package us.stumble.stumbler.user

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.websocket.server.PathParam

@RestController
@RequestMapping("/api/users")
class UserController {
    @GetMapping("/{id}")
    fun getUser(@PathVariable id: Long)
        :



}
